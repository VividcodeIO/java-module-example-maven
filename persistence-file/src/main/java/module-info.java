import io.vividcode.advancedjava.module.persistence.PersistenceService;
import io.vividcode.advancedjava.module.persistence.file.FilePersistenceService;

module io.vividcode.advancedjava.module.persistence.file {
  requires transitive io.vividcode.advancedjava.module.persistence;
  provides PersistenceService with FilePersistenceService;
}