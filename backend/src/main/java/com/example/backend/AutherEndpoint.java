package com.example.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.response.CollectionResponse;
import com.google.api.server.spi.response.NotFoundException;
import com.google.appengine.api.datastore.Cursor;
import com.google.appengine.api.datastore.QueryResultIterator;
import com.googlecode.objectify.ObjectifyService;
import com.googlecode.objectify.cmd.Query;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.annotation.Nullable;
import javax.inject.Named;

import static com.googlecode.objectify.ObjectifyService.ofy;

/**
 * WARNING: This generated code is intended as a sample or starting point for using a
 * Google Cloud Endpoints RESTful API with an Objectify entity. It provides no data access
 * restrictions and no data validation.
 * <p>
 * DO NOT deploy this code unchanged as part of a real application to real users.
 */
@Api(
        name = "autherApi",
        version = "v1",
        resource = "auther",
        namespace = @ApiNamespace(
                ownerDomain = "backend.example.com",
                ownerName = "backend.example.com",
                packagePath = ""
        )
)
public class AutherEndpoint {

    private static final Logger logger = Logger.getLogger(AutherEndpoint.class.getName());

    private static final int DEFAULT_LIST_LIMIT = 20;

    static {
        // Typically you would register this inside an OfyServive wrapper. See: https://code.google.com/p/objectify-appengine/wiki/BestPractices
        ObjectifyService.register(Author.class);
    }

    /**
     * Returns the {@link Author} with the corresponding ID.
     *
     * @param id the ID of the entity to be retrieved
     * @return the entity with the corresponding ID
     * @throws NotFoundException if there is no {@code Author} with the provided ID.
     */
    @ApiMethod(
            name = "get",
            path = "auther/{id}",
            httpMethod = ApiMethod.HttpMethod.GET)
    public Author get(@Named("id") Long id) throws NotFoundException {
        logger.info("Getting Author with ID: " + id);
        Author author = ofy().load().type(Author.class).id(id).now();
        if (author == null) {
            throw new NotFoundException("Could not find Author with ID: " + id);
        }
        return author;
    }

    /**
     * Inserts a new {@code Author}.
     */
    @ApiMethod(
            name = "insert",
            path = "author",
            httpMethod = ApiMethod.HttpMethod.POST)
    public Author insert(Author author) {
        // Typically in a RESTful API a POST does not have a known ID (assuming the ID is used in the resource path).
        // You should validate that author.id has not been set. If the ID type is not supported by the
        // Objectify ID generator, e.g. long or String, then you should generate the unique ID yourself prior to saving.
        //
        // If your client provides the ID then you should probably use PUT instead.
        ofy().save().entity(author).now();
        logger.info("Created Author.");

        return ofy().load().entity(author).now();
    }

    /**
     * Updates an existing {@code Author}.
     *
     * @param id     the ID of the entity to be updated
     * @param author the desired state of the entity
     * @return the updated version of the entity
     * @throws NotFoundException if the {@code id} does not correspond to an existing
     *                           {@code Author}
     */
    @ApiMethod(
            name = "update",
            path = "author/{id}",
            httpMethod = ApiMethod.HttpMethod.PUT)
    public Author update(@Named("id") Long id, Author author) throws NotFoundException {
        // TODO: You should validate your ID parameter against your resource's ID here.
        checkExists(id);
        ofy().save().entity(author).now();
        logger.info("Updated Author: " + author);
        return ofy().load().entity(author).now();
    }

    /**
     * Deletes the specified {@code Author}.
     *
     * @param id the ID of the entity to delete
     * @throws NotFoundException if the {@code id} does not correspond to an existing
     *                           {@code Author}
     */
    @ApiMethod(
            name = "remove",
            path = "auther/{id}",
            httpMethod = ApiMethod.HttpMethod.DELETE)
    public void remove(@Named("id") Long id) throws NotFoundException {
        checkExists(id);
        ofy().delete().type(Author.class).id(id).now();
        logger.info("Deleted Author with ID: " + id);
    }

    /**
     * List all entities.
     *
     * @param cursor used for pagination to determine which page to return
     * @param limit  the maximum number of entries to return
     * @return a response that encapsulates the result list and the next page token/cursor
     */
    @ApiMethod(
            name = "list",
            path = "auther",
            httpMethod = ApiMethod.HttpMethod.GET)
    public CollectionResponse<Author> list(@Nullable @Named("cursor") String cursor, @Nullable @Named("limit") Integer limit) {
        limit = limit == null ? DEFAULT_LIST_LIMIT : limit;
        Query<Author> query = ofy().load().type(Author.class).limit(limit);
        if (cursor != null) {
            query = query.startAt(Cursor.fromWebSafeString(cursor));
        }
        QueryResultIterator<Author> queryIterator = query.iterator();
        List<Author> authorList = new ArrayList<Author>(limit);
        while (queryIterator.hasNext()) {
            authorList.add(queryIterator.next());
        }
        return CollectionResponse.<Author>builder().setItems(authorList).setNextPageToken(queryIterator.getCursor().toWebSafeString()).build();
    }

    private void checkExists(Long id) throws NotFoundException {
        try {
            ofy().load().type(Author.class).id(id).safe();
        } catch (com.googlecode.objectify.NotFoundException e) {
            throw new NotFoundException("Could not find Author with ID: " + id);
        }
    }
}