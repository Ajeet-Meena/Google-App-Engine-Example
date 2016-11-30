package com.example.backend.Retrofit;

import com.example.backend.ExtractApi.Models.ExtractedNewsObject.ExtractedNewsObject;
import com.example.backend.ExtractApi.Models.NewsClassification.NewsClassification;
import com.example.backend.SocialApis.Models.FacebookProfile;

import retrofit2.Call;
import retrofit2.http.GET;
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
}
