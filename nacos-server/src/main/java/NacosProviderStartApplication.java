import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: aoyh
 * @Despriction:
 * @Package: test
 * @Date:Created in 2020-05-26 上午 10:10
 * @Modify By:
 */
@SpringBootApplication
@ComponentScan(basePackages = {"org.ao"})
@EnableDiscoveryClient
public class NacosProviderStartApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosProviderStartApplication.class);
    }
}
