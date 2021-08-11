package io.github.danilopiazza.spring.web.xml_config.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import io.github.danilopiazza.spring.web.xml_config.model.Greeting;

@Controller
@RequestMapping("greetings")
public class GreetingController {
    @GetMapping
    public String greet(@RequestParam(name = "name", defaultValue = "World") String name, Model model) {
        Greeting greeting = new Greeting(name);
        model.addAttribute("greeting", greeting);
        return "greetings";
    }
}
