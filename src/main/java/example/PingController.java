package example;


import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PingController {

  @RequestMapping(path = "/ping", method = RequestMethod.GET)
  public Map<String, String> ping() {
    Map<String, String> pong = new HashMap<>();
    pong.put("pong", "Hello, World!");
    return pong;
  }

  @RequestMapping(path = "/myJavaFunction", method = RequestMethod.GET)
  public Map<String, String> ping3() {
    Map<String, String> pong = new HashMap<>();
    pong.put("pong", "Hello, World! myJavaFunction");
    return pong;
  }

  @RequestMapping(path = "/", method = RequestMethod.GET)
  public Map<String, String> ping2() {
    Map<String, String> pong = new HashMap<>();
    pong.put("pong", "Hello, World! 1111111");
    return pong;
  }

  @RequestMapping(path = "/test", method = RequestMethod.GET)
  public String test() {
    return "hello world";
  }

}
