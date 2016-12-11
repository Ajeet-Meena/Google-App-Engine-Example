package io.wallmag.backend;

import io.wallmag.backend.GcmApi.Models.RegistrationRecord;
import io.wallmag.backend.Retrofit.APIService;
import io.wallmag.backend.Retrofit.RestClient;
import com.googlecode.objectify.ObjectifyService;

import java.util.logging.Logger;

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
  private static final Logger logger = Logger.getLogger(ApplicationService.class.getName());
  private static RestClient getRestClient(String baseUrl) {
    if (restClient == null || !prevBaseUrl.equals(baseUrl)) {
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
    ObjectifyService.register(RegistrationRecord.class);
    myApplication = this;
  }

  public void contextDestroyed(ServletContextEvent event) {
    // App Engine does not currently invoke this method.
  }
}