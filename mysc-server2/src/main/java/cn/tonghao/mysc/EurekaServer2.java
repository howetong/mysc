package cn.tonghao.mysc;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by howetong on 9/12/2017.
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServer2 {
    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaServer2.class).web(true).run(args);
    }
}
