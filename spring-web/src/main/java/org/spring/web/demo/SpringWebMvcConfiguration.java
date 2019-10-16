package org.spring.web.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Creat by IntelliJ IDEA
 *
 * @author xiehua
 * @date 2019-10-16
 */
@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "org.spring.web.demo.controller")
public class SpringWebMvcConfiguration {
}
