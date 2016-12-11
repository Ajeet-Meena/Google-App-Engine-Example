package io.wallmag.backend.SocialApis;

import io.wallmag.backend.ApplicationConstants;
import io.wallmag.backend.ApplicationService;
import io.wallmag.backend.SocialApis.Models.FacebookProfile;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.response.NotFoundException;

import java.io.IOException;
import java.util.logging.Logger;

import javax.inject.Named;

/**
 * Contains all APIs to get all Social Info.
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