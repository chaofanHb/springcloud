package cn.cloud.service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hb on 2018/8/28.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index() {
        return "/hello celled";
    }
}
