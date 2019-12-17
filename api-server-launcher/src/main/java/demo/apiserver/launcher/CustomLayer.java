package demo.apiserver.launcher;

import java.lang.module.Configuration;
import java.lang.module.ModuleFinder;
import java.nio.file.Path;
import java.util.Set;

public class CustomLayer {

  public static ModuleLayer createLayer(Path path, Set<String> modules) {
    Configuration configuration = ModuleLayer.boot()
        .configuration()
        .resolve(ModuleFinder.of(path), ModuleFinder.of(), modules);
    return ModuleLayer.boot()
        .defineModulesWithOneLoader(configuration, ClassLoader.getSystemClassLoader());
  }
}
