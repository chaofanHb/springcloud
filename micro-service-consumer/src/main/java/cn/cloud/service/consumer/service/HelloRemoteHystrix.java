package cn.cloud.service.consumer.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by hb on 2018/8/28.
 */
@Component
public class HelloRemoteHystrix implements HelloRemote{

    @Override
    public String hello() {
        return "hello this messge send failed ";
    }
}
