package io.github.danilopiazza.spring.web.xml_config.model;

public class Greeting {
    private final String name;

    public Greeting(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
