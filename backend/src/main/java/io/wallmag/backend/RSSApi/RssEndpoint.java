package io.wallmag.backend.RSSApi;

import io.wallmag.backend.ApplicationConstants;
import io.wallmag.backend.ApplicationService;
import io.wallmag.backend.Retrofit.ApiResponse;
import io.wallmag.backend.RSSApi.Models.SubscriptionListResponse.SubscriptionListResponse;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.response.NotFoundException;

import java.io.IOException;
import java.util.logging.Logger;

import javax.inject.Named;

@Api(
        name = "rssApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.example.com",
                ownerName = "backend.example.com",
                packagePath = ""
        )
)
public class RssEndpoint {

    private static final Logger logger = Logger.getLogger(RssEndpoint.class.getName());

    @ApiMethod(
            name = "subscribeTopic",
            path = "subscribeTopic",
            httpMethod = ApiMethod.HttpMethod.GET)
    public ApiResponse subscribeTopic(@Named("callbackUrl") String callbackUrl, @Named("topicUrl") String topicUrl) throws NotFoundException, IOException {
        return ApplicationService.getAPIService(ApplicationConstants.SUPERFEEDR_BASE_URL)
                .subscribeRss(topicUrl,callbackUrl,ApplicationConstants.FORMATTING_JSON).execute().body();
    }

    @ApiMethod(
            name = "unsubscribeTopic",
            path = "unsubscribeTopic",
            httpMethod = ApiMethod.HttpMethod.GET)
    public ApiResponse unsubscribeTopic(@Named("callbackUrl") String callbackUrl, @Named("topicUrl") String topicUrl) throws NotFoundException, IOException {
        return ApplicationService.getAPIService(ApplicationConstants.SUPERFEEDR_BASE_URL)
                .unsubscribeRss(topicUrl,callbackUrl).execute().body();
    }

    @ApiMethod(
            name = "getSubscribedRssList",
            path = "getSubscribedRssList",
            httpMethod = ApiMethod.HttpMethod.GET)
    public SubscriptionListResponse getSubscribedRssList(@Named("page") int page, @Named("noOfItems") int noOfItems) throws NotFoundException, IOException {
        return ApplicationService.getAPIService(ApplicationConstants.SUPERFEEDR_BASE_URL)
                .getSubscribedRssList(page,noOfItems,true).execute().body();
    }

    @ApiMethod(
            name = "retrieveRss",
            path = "retrieveRss",
            httpMethod = ApiMethod.HttpMethod.GET)
    public ApiResponse retrieveRss(@Named("callbackUrl") String callbackUrl, @Named("topicUrl") String topicUrl, @Named("count") int count) throws NotFoundException, IOException {
        return ApplicationService.getAPIService(ApplicationConstants.SUPERFEEDR_BASE_URL)
                .retriveRss(topicUrl,callbackUrl,ApplicationConstants.FORMATTING_JSON, count).execute().body();
    }
}