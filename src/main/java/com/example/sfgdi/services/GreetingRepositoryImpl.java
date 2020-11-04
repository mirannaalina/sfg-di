package com.example.sfgdi.services;

public class GreetingRepositoryImpl implements GreetingRepository {

    private GreetingRepository greetingRepository;

    public GreetingRepositoryImpl(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }
}
