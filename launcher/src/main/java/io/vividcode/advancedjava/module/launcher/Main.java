package io.vividcode.advancedjava.module.launcher;

import io.vividcode.advancedjava.module.model.User;
import io.vividcode.advancedjava.module.service.EntityService;

public class Main {

  public static void main(String[] args) {
    EntityService entityService = new EntityService();
    entityService.create(new User());
  }
}
