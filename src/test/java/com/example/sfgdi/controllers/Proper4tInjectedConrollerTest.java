package com.example.sfgdi.controllers;

import com.example.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Proper4tInjectedConrollerTest {

    Proper4tInjectedConroller controller;

    @BeforeEach
    void setUp(){
        controller = new Proper4tInjectedConroller();

        controller.greetingService = new ConstructorGreetingService();
    }
    @Test
    void getGreeting() {

        System.out.println(controller.greetingService);
    }

}