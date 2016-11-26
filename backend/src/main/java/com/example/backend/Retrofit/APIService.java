package com.example.backend.Retrofit;

import com.example.backend.SocialApis.Models.FacebookProfile;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Ajeet Kumar Meena on 18-06-2016.
 */
public interface APIService {
    @GET("/me?fields=id,name,about,age_range,devices,birthday,gender,hometown,first_name,last_name")
    Call<FacebookProfile> getFacebookProfile(
            @Query("access_token") String accessToken
    );
}
