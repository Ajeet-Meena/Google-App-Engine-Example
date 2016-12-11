package io.wallmag.backend.ExtractionApi;

import io.wallmag.backend.ApplicationConstants;
import io.wallmag.backend.ApplicationService;
import io.wallmag.backend.ExtractionApi.Models.ExtractedNewsObject.ExtractedNewsObject;
import io.wallmag.backend.ExtractionApi.Models.NewsClassification.NewsClassification;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.response.NotFoundException;

import java.io.IOException;
import java.net.URLEncoder;
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
        ExtractedNewsObject extractedNewsObject = ApplicationService.getAPIService(ApplicationConstants.EMBEDED_API_BASE_URL)
                .extractUrl(url,ApplicationConstants.EMBEDED_API_KEY).execute().body();
        extractedNewsObject.setNewsClassification(getNewsClassification(
                extractedNewsObject.getTitle() == null ? "": extractedNewsObject.getTitle()
                , extractedNewsObject.getContent() == null ? "": extractedNewsObject.getContent()
        ));
        return extractedNewsObject;
    }

    @ApiMethod(
            name = "getNewsClassification",
            path = "getNewsClassification/",
            httpMethod = ApiMethod.HttpMethod.GET)
    public NewsClassification getNewsClassification(@Named("title") String title, @Named("content") String content) throws NotFoundException, IOException {
        logger.info("Getting classification for title: " + title + " content: " + content);
        return ApplicationService.getAPIService(ApplicationConstants.MEANING_CLOUD_API_BASE_URL)
                .getNewsClassification(ApplicationConstants.MEANING_CLOULD_API_KEY,
                        ApplicationConstants.FORMATTING_JSON,"n",URLEncoder.encode(title,"UTF-8"), URLEncoder.encode(content,"UTF-8"),ApplicationConstants.IPTC_MODEL).execute().body();
    }
}