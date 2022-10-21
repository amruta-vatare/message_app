package com.bridgelabz.message_app.services;

import com.bridgelabz.message_app.models.Greeting;

public interface IGreetingService {
    public Greeting getGreeting(long counter,String name);
}
