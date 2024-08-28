package edu.panov.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("edu.panov.spring")
@EnableAspectJAutoProxy
public class MyConfig {
}
