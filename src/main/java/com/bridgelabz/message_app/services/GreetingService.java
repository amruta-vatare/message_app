package com.bridgelabz.message_app.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bridgelabz.message_app.models.Greeting;
import com.bridgelabz.message_app.models.GreetingMessage;
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

    @Override
    public GreetingMessage getGreetingById(long id) {
      GreetingData greeting = repository.findById(id).get();      
      var result = new GreetingMessage();
      result.setMessage(greeting.msg);
      return result;
    }

    @Override
    public List<GreetingMessage> getGreetingAll() {
     List<GreetingData> greetings = repository.findAll();
     List<GreetingMessage>greetingMessages = new ArrayList<>();
     for (GreetingData greeting : greetings) {
      GreetingMessage msgGreeting = new GreetingMessage();
      msgGreeting.setMessage(greeting.msg);
      greetingMessages.add(msgGreeting);
     }
      return greetingMessages;
    }
    @Override
    public void updateGreeting(long id, GreetingMessage greetingMessage) {
      GreetingData greeting = repository.findById(id).get();
      greeting.msg = greetingMessage.getMessage();
      repository.save(greeting);
    }

    @Override
    public void deleteGreeting(long id) {
      GreetingData greeting = repository.findById(id).get();
      repository.delete(greeting);
    }


   
}
