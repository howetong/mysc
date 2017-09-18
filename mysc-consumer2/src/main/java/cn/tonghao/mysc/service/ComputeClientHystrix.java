package cn.tonghao.mysc.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by howetong on 9/14/2017.
 */
@Component
public class ComputeClientHystrix implements ComputeClient{

    public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return -9999;
    }
}
