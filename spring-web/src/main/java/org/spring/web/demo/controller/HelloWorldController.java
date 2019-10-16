package org.spring.web.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Creat by IntelliJ IDEA
 *
 * @author xiehua
 * @date 2019-10-16
 */
@Controller
public class HelloWorldController {
    @ResponseBody
    @RequestMapping(value = "/hello")
    public String hello() {
        return "Hello World !!!";
    }
}
