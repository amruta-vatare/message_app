package com.bridgelabz.message_app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.message_app.models.Greeting;
import com.bridgelabz.message_app.repository.IGreetingRepository;
import com.bridgelabz.message_app.repository.models.GreetingData;

@Service
public class GreetingService implements IGreetingService {
    @Autowired
    IGreetingRepository repository;

    @Override
    public Greeting getGreeting(long counter, String name) {
        return new Greeting(counter, name);
    }

    @Override
    public void save(String msg) {
      repository.save(new GreetingData(msg));  
    }
}
