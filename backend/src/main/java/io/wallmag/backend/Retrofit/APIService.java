package io.wallmag.backend.Retrofit;

import io.wallmag.backend.ApplicationConstants;
import io.wallmag.backend.ExtractionApi.Models.ExtractedNewsObject.ExtractedNewsObject;
import io.wallmag.backend.ExtractionApi.Models.NewsClassification.NewsClassification;
import io.wallmag.backend.RSSApi.Models.RetriveRssResponse.RetriveRssResponse;
import io.wallmag.backend.RSSApi.Models.SubscriptionListResponse.SubscriptionListResponse;
import io.wallmag.backend.SocialApis.Models.FacebookProfile;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by Ajeet Kumar Meena on 18-06-2016.
 */

/**
 * Contains all API used throughout the application.
 */
public interface APIService {
    /**
     * API to get Facebook Profile Object with corresponding Access Token.
     * @param accessToken
     * @return
     */
    @GET("/me?fields=id,name,about,age_range,devices,birthday,gender,hometown,first_name,last_name")
    Call<FacebookProfile> getFacebookProfile(
            @Query("access_token") String accessToken
    );


    @GET("/1/extract")
    Call<ExtractedNewsObject> extractUrl(
            @Query("url") String url,
            @Query("key") String key
    );

    @GET("/class-1.1")
    Call<NewsClassification> getNewsClassification(
            @Query("key") String key,
            @Query("of") String format,
            @Query("verbose") String verbose,
            @Query("title") String title,
            @Query("txt") String content,
            @Query("model") String model
    );

    @POST("?hub.mode=subscribe&authorization="+ ApplicationConstants.SUPERFEEDR_BASE_64_AUTH)
    Call<ApiResponse> subscribeRss(
             @Query("hub.topic") String topicUrl,
             @Query("hub.callback") String callbackUrl,
             @Query("format") String format
     );

    @POST("?hub.mode=unsubscribe&authorization="+ ApplicationConstants.SUPERFEEDR_BASE_64_AUTH)
    Call<ApiResponse> unsubscribeRss(
            @Query("hub.topic") String topicUrl,
            @Query("hub.callback") String callbackUrl
    );

    @GET("?hub.mode=list&authorization="+ ApplicationConstants.SUPERFEEDR_BASE_64_AUTH)
    Call<SubscriptionListResponse> getSubscribedRssList(
            @Query("page") int page,
            @Query("by_page") int noOfItems,
            @Query("detailed") boolean isDetailed
    );

    @GET("?hub.mode=retrieve&authorization="+ ApplicationConstants.SUPERFEEDR_BASE_64_AUTH)
    Call<RetriveRssResponse> retriveRss(
            @Query("hub.topic") String topicUrl,
            @Query("hub.callback") String callbackUrl,
            @Query("format") String format,
            @Query("count") int count
    );

    @GET("?hub.mode=retrieve&authorization="+ ApplicationConstants.SUPERFEEDR_BASE_64_AUTH)
    Call<RetriveRssResponse> retriveRssBeforeId(
            @Query("hub.topic") String topicUrl,
            @Query("hub.callback") String callbackUrl,
            @Query("format") String format,
            @Query("before") String beforeItemId
    );


    @GET("?hub.mode=retrieve&authorization="+ ApplicationConstants.SUPERFEEDR_BASE_64_AUTH)
    Call<RetriveRssResponse> retriveRssAfterId(
            @Query("hub.topic") String topicUrl,
            @Query("hub.callback") String callbackUrl,
            @Query("format") String format,
            @Query("after") int afterItemId
    );
}
