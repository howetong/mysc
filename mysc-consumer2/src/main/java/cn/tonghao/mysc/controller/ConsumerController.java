package cn.tonghao.mysc.controller;

import cn.tonghao.mysc.service.ComputeClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by howetong on 9/12/2017.
 */
@RestController
public class ConsumerController {

    @Resource
    ComputeClient computeClient;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add() {
        return computeClient.add(10, 20);
    }
}