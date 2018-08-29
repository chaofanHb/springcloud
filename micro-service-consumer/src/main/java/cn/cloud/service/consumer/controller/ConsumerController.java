package cn.cloud.service.consumer.controller;

import cn.cloud.service.consumer.service.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hb on 2018/8/28.
 */
@RestController
public class ConsumerController {

    @Autowired
    HelloRemote helloRemote;

    @RequestMapping("/hello")
    public String index() {
        return helloRemote.hello();
    }

}
