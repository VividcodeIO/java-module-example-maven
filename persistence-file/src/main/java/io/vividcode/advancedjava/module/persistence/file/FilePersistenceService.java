package io.vividcode.advancedjava.module.persistence.file;

import io.vividcode.advancedjava.module.model.Entity;
import io.vividcode.advancedjava.module.persistence.PersistenceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FilePersistenceService implements PersistenceService {
  private static final Logger logger = LoggerFactory.getLogger(FilePersistenceService.class);

  @Override
  public void save(Entity entity) {
    logger.info("Saved to file: " + entity);
  }
}
