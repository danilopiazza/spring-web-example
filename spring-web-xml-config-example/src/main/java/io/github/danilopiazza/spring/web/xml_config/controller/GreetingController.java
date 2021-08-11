package io.github.danilopiazza.spring.web.xml_config.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import io.github.danilopiazza.spring.web.xml_config.service.GreetingService;

@Controller
@RequestMapping("greetings")
public class GreetingController {
    private final GreetingService service;

    public GreetingController(GreetingService service) {
        this.service = service;
    }

    @GetMapping
    public String greet(@RequestParam(name = "name", defaultValue = "World") String name, Model model) {
        model.addAttribute("greeting", service.greet(name));
        return "greetings";
    }
}
