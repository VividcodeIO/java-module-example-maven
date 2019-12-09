package io.vividcode.advancedjava.module.persistence;

import io.vividcode.advancedjava.module.model.Entity;

public interface PersistenceService {
  void save(Entity entity);
}
