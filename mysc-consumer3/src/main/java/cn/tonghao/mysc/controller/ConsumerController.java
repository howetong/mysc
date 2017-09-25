package cn.tonghao.mysc.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Created by howetong on 2017/9/22.
 */
@RestController
public class ConsumerController {

    @Resource
    ConsumerService consumerService;

    @GetMapping("/consumer")
    public String dc() {
        return consumerService.consumer();
    }

    @Service
    class ConsumerService {

        @Resource
        RestTemplate restTemplate;

        @HystrixCommand(fallbackMethod = "fallback")
        public String consumer() {
            return restTemplate.getForObject("http://compute-service/add?a=1&b=2", String.class);
        }

        public String fallback() {
            return "fallbck";
        }

    }

}
