package org.techbrief.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/public")
    public String publicEndpoint() {
        return "This is a public endpoint";
    }

    @GetMapping("/dashboard")
    public String dashboard() {
        return "Welcome to protected dashboard!";
    }

    @GetMapping("/home")
    public String home() {
        return "Welcome";
    }
}
