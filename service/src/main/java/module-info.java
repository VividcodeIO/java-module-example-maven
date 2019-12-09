module io.vividcode.advancedjava.module.service {
  requires transitive io.vividcode.advancedjava.module.persistence;
  uses io.vividcode.advancedjava.module.persistence.PersistenceService;
  exports io.vividcode.advancedjava.module.service;
}