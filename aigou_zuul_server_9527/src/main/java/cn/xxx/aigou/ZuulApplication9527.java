package cn.xxx.aigou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy//zuul
@ComponentScan("cn.xxx.aigou.swagger2")
//@EnableSwagger2
public class ZuulApplication9527 {

    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication9527.class);
    }
}
