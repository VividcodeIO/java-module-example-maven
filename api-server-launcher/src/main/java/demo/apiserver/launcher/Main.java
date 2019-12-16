package demo.apiserver.launcher;

import demo.apiserver.ApiServer;
import java.util.ServiceLoader;

public class Main {

  public static void main(String[] args) {
    for (ApiServer apiServer : ServiceLoader.load(ApiServer.class)) {
      apiServer.start();
    }
  }
}
