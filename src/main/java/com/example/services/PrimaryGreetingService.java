package com.example.services;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService {

    //oricate servicii ar fi, serviciul primary are intaietate

    @Override
    public String sayGreeting(){
        return "Hello world - from primary bean";
    }
}
