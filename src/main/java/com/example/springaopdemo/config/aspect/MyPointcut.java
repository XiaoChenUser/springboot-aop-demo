package com.example.springaopdemo.config.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcut {
    @Pointcut(value = "execution(* *To(..))")
    public void suffixTo() {
    }
}
