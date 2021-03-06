package com.example.springaopdemo.service;


import org.springframework.stereotype.Service;

@Service
public class NaiveWaiter implements Waiter{
    @Override
    public void greetTo(String clientName) {
        System.out.println("NaiveWaiter:greet to " + clientName + "...");
    }

    @Override
    public void serveTo(String clientName) {
        System.out.println("NaiveWaiter:serving " + clientName + "...");
    }

    public void smile(String clientName, int times) {
        System.out.println("NaiveWaiter:smile to " + clientName + " " + times + " times");
    }
}
