package com.example.backend.Retrofit;



import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Ajeet Kumar Meena on 18-06-2016.
 */
public class RestClient {

    private APIService apiService;

    public RestClient(String baseUrl) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .callFactory(new RetrofitCall.Factory())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        apiService = retrofit.create(APIService.class);

    }

    public APIService getApiService() {
        return apiService;
    }
}
