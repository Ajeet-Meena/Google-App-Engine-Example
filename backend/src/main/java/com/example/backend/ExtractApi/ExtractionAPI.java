package com.example.backend.ExtractApi;

import com.example.backend.ApplicationConstants;
import com.example.backend.ApplicationService;
import com.example.backend.ExtractApi.Models.ExtractedNewsObject;
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
        name = "extractApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.example.com",
                ownerName = "backend.example.com",
                packagePath = ""
        )
)
public class ExtractionAPI {

    private static final Logger logger = Logger.getLogger(ExtractionAPI.class.getName());

    /**
     * Returns Extracted News Object from embeded.ly API.
     * @param url Url to be extracted
     * @return Extracted News Object
     * @throws NotFoundException
     * @throws IOException
     */
    @ApiMethod(
            name = "extractUrl",
            path = "extractUrl/",
            httpMethod = ApiMethod.HttpMethod.GET)
    public ExtractedNewsObject extractedNewsObject(@Named("url") String url) throws NotFoundException, IOException {
        logger.info("Getting Extracted News Object of url: " + url);
        return ApplicationService.getAPIService(ApplicationConstants.EMBEDED_API_BASE_URL)
                .extractUrl(url,ApplicationConstants.EMBEDED_API_KEY).execute().body();
    }

    @ApiMethod(
            name = "getNewsClassification",
            path = "getNewsClassification/",
            httpMethod = ApiMethod.HttpMethod.GET)
    public ExtractedNewsObject getNewsClassification(@Named("title") String title, @Named("content") String content) throws NotFoundException, IOException {
        logger.info("Getting classification for title: " + title + " content: " + content);
        return null;
    }

}