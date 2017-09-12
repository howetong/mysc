package cn.tonghao.mysc;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by howetong on 9/12/2017.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ComputeServiceApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ComputeServiceApplication.class).web(true).run(args);
    }
}