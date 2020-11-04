package com.example.sfgdi.services;


import org.springframework.stereotype.Service;

@Service
public class PrimarySpanishGreetingService implements GreetingService {


    @Override
    public String sayGreeting() {
        return "Holaa - property";
    }

}