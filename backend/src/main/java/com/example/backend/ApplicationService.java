package com.example.backend;

import com.example.backend.Retrofit.APIService;
import com.example.backend.Retrofit.RestClient;
import com.googlecode.objectify.ObjectifyService;

import javax.servlet.ServletContextListener;
import javax.servlet.ServletContextEvent;

/**
 * ApplicationService, a ServletContextListener, is setup in web.xml to run before a JSP is run.  This is
 * required to let JSP's access Ofy.
 **/
public class ApplicationService implements ServletContextListener {

  private static ApplicationService myApplication;
  private static RestClient restClient;
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

  public static APIService getAPIService(String baseUrl) {
    return getRestClient(baseUrl).getApiService();
  }

  public void contextInitialized(ServletContextEvent event) {
    ObjectifyService.register(Quote.class);
    ObjectifyService.register(Author.class);
    myApplication = this;
  }

  public void contextDestroyed(ServletContextEvent event) {
    // App Engine does not currently invoke this method.
  }
}