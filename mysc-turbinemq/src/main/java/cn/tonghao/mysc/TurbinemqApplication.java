package cn.tonghao.mysc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;

/**
 * Created by howetong on 2017/9/25.
 */
@SpringBootApplication
@EnableAutoConfiguration
@EnableTurbineStream
public class TurbinemqApplication {

    public static void main(String[] args) {
        SpringApplication.run(TurbinemqApplication.class,args);
    }
}
