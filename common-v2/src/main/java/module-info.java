import demo.common.GreetingService;
import demo.common.impl.GreetingServiceImpl;

module demo.common {
  exports demo.common;
  provides GreetingService with GreetingServiceImpl;
}