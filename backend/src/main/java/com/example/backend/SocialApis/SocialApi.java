package com.example.backend.SocialApis;

import com.example.backend.ApplicationConstants;
import com.example.backend.ApplicationService;
import com.example.backend.SocialApis.Models.FacebookProfile;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.response.CollectionResponse;
import com.google.api.server.spi.response.NotFoundException;
import com.google.appengine.api.datastore.Cursor;
import com.google.appengine.api.datastore.QueryResultIterator;
import com.googlecode.objectify.ObjectifyService;
import com.googlecode.objectify.cmd.Query;

import java.io.IOException;
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
        name = "socialApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.example.com",
                ownerName = "backend.example.com",
                packagePath = ""
        )
)
public class SocialApi {

    private static final Logger logger = Logger.getLogger(SocialApi.class.getName());

    /**
     * Returns the {@link FacebookProfile} with the corresponding ID.
     *
     * @param accessToken the accessToken of facebook Profile
     * @return FacebookProfile with corresponding accessToken
     * @throws NotFoundException if there is no {@code Author} with the provided ID.
     */
    @ApiMethod(
            name = "getFacebookProfile",
            path = "getFacebookProfile/",
            httpMethod = ApiMethod.HttpMethod.GET)
    public FacebookProfile get(@Named("access_token") String accessToken) throws NotFoundException, IOException {
        logger.info("Getting Facebook Profile Object with Token: " + accessToken);
        return ApplicationService.getAPIService(ApplicationConstants.GRAPH_API_BASE_URL)
                .getFacebookProfile(accessToken).execute().body();
    }

}