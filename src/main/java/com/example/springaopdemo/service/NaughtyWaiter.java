package com.example.springaopdemo.service;

import com.example.springaopdemo.bean.Person;
import org.springframework.stereotype.Service;

@Service
public class NaughtyWaiter implements Waiter{
    @Override
    public void greetTo(String clientName) {
        System.out.println("NaughtyWaiter:greet to " + clientName + "...");
    }

    @Override
    public void serveTo(String clientName) {
        System.out.println("NaughtyWaiter:serving " + clientName + "...");
    }

    public void joke(String clientName, String times) {
        System.out.println("NaughtyWaiter:joke to " + clientName + " " + times + " times");
    }

    public void talk(Person person) {
        System.out.println("NaughtyWaiter:talk to " + person.getName());
    }
}
