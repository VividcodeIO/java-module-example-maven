package demo.common.impl;

import demo.common.GreetingService;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class GreetingServiceImpl implements GreetingService {

  @Override
  public String greet(String name, Locale locale) {
    ResourceBundle resourceBundle = ResourceBundle.getBundle("base", locale);
    MessageFormat messageFormat = new MessageFormat(resourceBundle.getString("greeting"));
    return messageFormat.format(new Object[]{name});
  }
}
