package com.example.springaopdemo.service;

import org.springframework.stereotype.Service;

@Service
public class SmartSeller implements Seller{
    @Override
    public void sellTo(String goods, String clientName) {
        System.out.println("SmartSeller sell " + goods + " to " + clientName);
    }

    public void showGoods(String goods) {
        System.out.println("SmartSeller shows " + goods);
    }

    public Double sold(double dollar) {
        return dollar;
    }

    public void throwing(boolean proxy) throws Exception {
        if (proxy) {
            throw new RuntimeException("RuntimeException 需要被增强方法拦截处理");
        }else {
            throw new Exception("不 aop 了，直接抛出吧");
        }
    }
}
