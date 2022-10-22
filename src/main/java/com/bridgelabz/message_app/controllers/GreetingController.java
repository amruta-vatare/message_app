package com.bridgelabz.message_app.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.message_app.models.Greeting;
import com.bridgelabz.message_app.models.GreetingMessage;
import com.bridgelabz.message_app.services.IGreetingService;

@RestController
public class GreetingController {
    public static final String template = "Hello %s !";
    public final AtomicLong counter = new AtomicLong();
    @Autowired
    IGreetingService service;
    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "world")String name){
       return service.getGreeting(counter.incrementAndGet(), String.format(template, name));
    }

    @GetMapping("/greetingv1")
    public Greeting greeting(@RequestParam(value = "firstName", defaultValue = "World")String firstName,
     @RequestParam(value = "lastName", defaultValue = "")String lastName){
        return service.getGreeting(counter.incrementAndGet(), String.format(template, firstName+" "+lastName));
    }

    @PostMapping("/msg")
    public void saveMsg(@RequestBody GreetingMessage greetingMessage){
        service.save(greetingMessage.getMessage());
    }
    
    @GetMapping("/greeting/{id}")
    public GreetingMessage greetingById(@PathVariable long id){
        return service.getGreetingById(id);
    }
}
