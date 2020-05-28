package org.ao.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: aoyh
 * @Despriction:
 * @Package: org.ao.controller
 * @Date:Created in 2020-05-27 下午 03:09
 * @Modify By:
 */
@RestController
public class ProivderControlller {

    @RequestMapping(value = "/echo/{string}", method = RequestMethod.GET)
    public String echo(@PathVariable String string) {
        return "Hello Nacos Discovery " + string;
    }

}
