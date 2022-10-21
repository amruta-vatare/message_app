package com.bridgelabz.message_app.services;

import org.springframework.stereotype.Service;

import com.bridgelabz.message_app.models.Greeting;

@Service
public class GreetingService implements IGreetingService {

    @Override
    public Greeting getGreeting(long counter, String name) {
       
        return new Greeting(counter, name);
    }
}
