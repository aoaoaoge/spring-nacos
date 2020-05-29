package org.ao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: aoyh
 * @Despriction:
 * @Package: org.ao
 * @Date:Created in 2020-05-27 下午 03:15
 * @Modify By:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConsumerStartApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosConsumerStartApplication.class);
    }

}
