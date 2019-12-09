package io.vividcode.advancedjava.module.service;

import io.vividcode.advancedjava.module.model.Entity;
import io.vividcode.advancedjava.module.persistence.PersistenceService;
import java.util.Optional;
import java.util.ServiceLoader;

public class EntityService {

  private PersistenceService persistenceService;

  public EntityService() {
    Optional<PersistenceService> findResult = ServiceLoader.load(PersistenceService.class)
        .findFirst();
    if (findResult.isPresent()) {
      persistenceService = findResult.get();
    } else {
      throw new RuntimeException("No persistence implementation.");
    }
  }

  public void create(Entity entity) {
    persistenceService.save(entity);
  }
}
