package org.ao.fallback;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @Author: aoyh
 * @Despriction:
 * @Package: org.ao.fallback
 * @Date:Created in 2020-05-28 下午 05:20
 * @Modify By:
 */
@RestController
public class GatewayFallbackProvider{

    @RequestMapping("/fallback")
    public Mono<String> fallback() {
        return Mono.just("fallback");
    }

}
