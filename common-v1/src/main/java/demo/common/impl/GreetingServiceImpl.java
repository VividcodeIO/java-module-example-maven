package demo.common.impl;

import demo.common.GreetingService;

public class GreetingServiceImpl implements GreetingService {

  @Override
  public String greet(String name) {
    return "Hello, " + name;
  }
}
