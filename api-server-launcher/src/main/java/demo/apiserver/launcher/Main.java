package demo.apiserver.launcher;

import demo.apiserver.ApiServer;
import java.nio.file.Paths;
import java.util.ServiceLoader;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    for (String path : args) {
      ModuleLayer layer = CustomLayer.createLayer(Paths.get(path), Set.of("demo.api"));
      doStart(layer);
    }
  }

  private static void doStart(ModuleLayer layer) {
    for (ApiServer apiServer : ServiceLoader.load(layer, ApiServer.class)) {
      apiServer.start();
    }
  }
}
