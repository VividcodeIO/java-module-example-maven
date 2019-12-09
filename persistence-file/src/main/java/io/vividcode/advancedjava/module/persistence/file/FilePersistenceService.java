package io.vividcode.advancedjava.module.persistence.file;

import io.vividcode.advancedjava.module.model.Entity;
import io.vividcode.advancedjava.module.persistence.PersistenceService;

public class FilePersistenceService implements PersistenceService {

  @Override
  public void save(Entity entity) {
    System.out.println("Save to file: " + entity);
  }
}
