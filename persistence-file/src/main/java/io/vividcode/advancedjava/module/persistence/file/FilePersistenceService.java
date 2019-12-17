package io.vividcode.advancedjava.module.persistence.file;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.vividcode.advancedjava.module.model.Entity;
import io.vividcode.advancedjava.module.persistence.PersistenceService;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.UUID;

public class FilePersistenceService implements PersistenceService {

  private ObjectMapper objectMapper = new ObjectMapper();
  private Path path;

  public FilePersistenceService() throws IOException {
    path = Files.createTempDirectory("file");
    ;
  }

  @Override
  public void save(Entity entity) throws Exception {
    try (OutputStream outputStream = Files.newOutputStream(path.resolve(UUID.randomUUID().toString()))) {
      objectMapper.writeValue(outputStream, entity);
    }
  }
}
