package cn.xxx.aigou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication//标识为springcloud项目
@EnableEurekaClient//eureka的客户端
public class PlatApplication8001 {

    public static void main(String[] args) {
        SpringApplication.run(PlatApplication8001.class);
    }
}
