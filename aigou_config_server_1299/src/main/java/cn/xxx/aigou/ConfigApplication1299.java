package cn.xxx.aigou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient//注册中心客户端
@EnableConfigServer//配置服务端
public class ConfigApplication1299 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication1299.class);
    }
}
