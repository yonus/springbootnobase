package com.kula.springnobootbase.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages ={"com.kula.springnobootbase.components"})
public class BaseApplicationConfiguration {
}
