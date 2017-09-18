package cm.tonghao.mysc.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by howetong on 2017/9/18.
 */
@RefreshScope
@RestController
class TestController {

    @Value("${form}")
    private String from;

    @Value("${key}")
    private String key;

    @RequestMapping("/from")
    public String from() {
        System.out.println(key);
        return this.from;
    }
}
