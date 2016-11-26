package com.example.backend;

import com.example.backend.Retrofit.APIService;
import com.example.backend.Retrofit.RestClient;
import com.googlecode.objectify.ObjectifyService;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.servlet.ServletContextListener;
import javax.servlet.ServletContextEvent;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/**
 * ApplicationService, a ServletContextListener, is setup in web.xml to run before a JSP is run.  This is
 * required to let JSP's access Ofy.
 **/
public class ApplicationService implements ServletContextListener {

  private static final int READ_TIMEOUT = 60 * 1000;
  private static final int CONNECTION_TIMEOUT = 60 * 1000;
  private static ApplicationService myApplication;
  private static RestClient restClient;
  private static OkHttpClient okHttpClient;
  public final String TAG = ApplicationService.class.getSimpleName();
  private static String prevBaseUrl = "";
  private static RestClient getRestClient(String baseUrl) {
    if (restClient == null && !prevBaseUrl.equals(baseUrl)) {
      restClient = new RestClient(baseUrl);
      prevBaseUrl = baseUrl;
    }
    return restClient;
  }

  public static synchronized ApplicationService getInstance() {
    return myApplication;
  }

/*  public static OkHttpClient getOkHttpClient() {
    if (okHttpClient == null) {
      HttpLoggingInterceptor logger = new HttpLoggingInterceptor();
      logger.setLevel(HttpLoggingInterceptor.Level.BODY);
      okHttpClient = new OkHttpClient.Builder().readTimeout(READ_TIMEOUT, TimeUnit.MILLISECONDS)
              .connectTimeout(CONNECTION_TIMEOUT, TimeUnit.MILLISECONDS).addInterceptor(logger).addInterceptor(new Interceptor() {
                @Override
                public okhttp3.Response intercept(Chain chain) throws IOException {
                  okhttp3.Request request = chain.request().newBuilder()
                          .addHeader("Accept", "application/json")
                          .addHeader("Content-type", "application/json").build();
                  return chain.proceed(request);
                }
              }).build();

    }
    return okHttpClient;
  }*/


  public static APIService getAPIService(String baseUrl) {
    return getRestClient(baseUrl).getApiService();
  }

  public void contextInitialized(ServletContextEvent event) {
    // This will be invoked as part of a warmup request, or the first user request if no warmup
    // request.
    ObjectifyService.register(Quote.class);
    ObjectifyService.register(Author.class);
    myApplication = this;
  }

  public void contextDestroyed(ServletContextEvent event) {
    // App Engine does not currently invoke this method.
  }
}