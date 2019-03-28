package cn.xxx.aigou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication7100 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication7100.class);
    }
}
