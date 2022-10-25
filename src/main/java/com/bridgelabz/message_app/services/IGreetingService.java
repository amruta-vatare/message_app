package com.bridgelabz.message_app.services;

import java.util.List;

import com.bridgelabz.message_app.models.Greeting;
import com.bridgelabz.message_app.models.GreetingMessage;


public interface IGreetingService {
    public Greeting getGreeting(long counter,String name);
    public void save(String msg);
    public GreetingMessage getGreetingById(long id);
    public List<GreetingMessage> getGreetingAll();
    public void updateGreeting(long id, GreetingMessage greetingMessage);
    public void deleteGreeting(long id);
}
