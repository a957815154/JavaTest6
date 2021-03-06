package io.choerodon.demo.api.controller.v1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Value("${myid}")
    String id;
    @Value("${myname}")
    String name;
    @GetMapping("/hello")
    public String hello() {
        return "hello world,"+id+","+name;
    }
}
