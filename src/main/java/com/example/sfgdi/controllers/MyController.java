package com.example.sfgdi.controllers;

import com.example.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String Hello(){

        return greetingService.sayGreeting();
    }
}
