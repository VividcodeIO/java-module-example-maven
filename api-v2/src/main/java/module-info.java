import demo.api.GreetingApiServer;
import demo.common.GreetingService;

module demo.api {
  requires transitive demo.apiserver;
  requires transitive demo.common;
  uses GreetingService;
  provides demo.apiserver.ApiServer with GreetingApiServer;
}