package demo.api;

import demo.apiserver.ApiServer;
import demo.common.GreetingService;
import java.util.Iterator;
import java.util.Locale;
import java.util.ServiceLoader;

public class GreetingApiServer implements ApiServer {

  public void start() {
    Iterator<GreetingService> iterator = ServiceLoader
        .load(GreetingService.class, GreetingApiServer.class.getClassLoader()).iterator();
    if (iterator.hasNext()) {
      String greeting = iterator.next().greet("Alex", Locale.SIMPLIFIED_CHINESE);
      System.out.println(greeting);
    }
  }
}
