package org.ao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: aoyh
 * @Despriction:
 * @Package: org.ao
 * @Date:Created in 2020-05-28 下午 03:44
 * @Modify By:
 */
@SpringBootApplication
@ComponentScan(basePackages = {"org.ao"})
@EnableDiscoveryClient
public class GatewayStartApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayStartApplication.class);
    }
}
