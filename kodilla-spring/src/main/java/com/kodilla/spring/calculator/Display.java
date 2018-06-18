package com.kodilla.spring.calculator;

import org.springframework.stereotype.Component;

@Component
public final class Display {

    public double displayValue(double val){
        System.out.println("Wynik: " + val);
        return val;
    }
}
