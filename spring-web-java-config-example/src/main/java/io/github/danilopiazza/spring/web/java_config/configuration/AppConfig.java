package io.github.danilopiazza.spring.web.java_config.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import io.github.danilopiazza.spring.web.java_config.Components;

@Configuration
@ComponentScan(basePackageClasses = Components.class)
public class AppConfig {
}
