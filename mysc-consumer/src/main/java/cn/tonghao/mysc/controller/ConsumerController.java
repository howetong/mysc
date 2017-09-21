package cn.tonghao.mysc.controller;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Created by howetong on 9/12/2017.
 */
@RestController
public class ConsumerController {

    @Resource
    LoadBalancerClient loadBalancerClient;

    @Resource
    RestTemplate restTemplate;

   @GetMapping("/consumer")
    public String dc() {
       ServiceInstance serviceInstance = loadBalancerClient.choose("consul-provider1");
       String url = "http://" + serviceInstance.getHost()+ ":" + serviceInstance.getPort() + "/dc";
       System.out.println(url);
       return restTemplate.getForObject(url, String.class);
   }
}