package cn.tonghao.mysc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by howetong on 2017/9/22.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer1 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer1.class,args);
    }

}
