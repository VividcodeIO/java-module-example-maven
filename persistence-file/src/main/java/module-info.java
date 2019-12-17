import io.vividcode.advancedjava.module.persistence.PersistenceService;
import io.vividcode.advancedjava.module.persistence.file.FilePersistenceService;

module io.vividcode.advancedjava.module.persistence.file {
  requires transitive io.vividcode.advancedjava.module.persistence;
  requires com.fasterxml.jackson.databind;
  requires com.google.common;
  provides PersistenceService with FilePersistenceService;
}