package io.github.danilopiazza.spring.web.xml_config.service;

import org.springframework.stereotype.Service;

import io.github.danilopiazza.spring.web.xml_config.model.Greeting;

@Service
public class GreetingService {
    public Greeting greet(String name) {
        return new Greeting(name);
    }
}
