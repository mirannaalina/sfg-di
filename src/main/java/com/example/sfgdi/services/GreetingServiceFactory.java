package com.example.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceFactory {

//    private GreetingRepository  greetingRepository;
//
//    public GreetingServiceFactory(GreetingRepository greetingRepository) {
//        this.greetingRepository = greetingRepository;
//    }



    public GreetingService createGreetingService(String lang){
        switch (lang){
            case "en":
                return new PrimaryGreetingService();
            case "es":
                return new PrimarySpanishGreetingService();
            default:
                return new PrimaryGreetingService();
        }
    }
}
