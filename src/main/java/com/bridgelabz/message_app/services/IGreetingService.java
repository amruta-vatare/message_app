package com.bridgelabz.message_app.services;

import com.bridgelabz.message_app.models.Greeting;
import com.bridgelabz.message_app.models.GreetingMessage;

public interface IGreetingService {
    public Greeting getGreeting(long counter,String name);
    public void save(String msg);
    public GreetingMessage getGreetingById(long id);
}
