package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public final class Calculator {

    @Autowired
    private Display display;

    public double add(double a, double b){
        return display.displayValue(a+b);
    }
    public double sub(double a, double b){
        return display.displayValue(a-b);
    }
    public double mul(double a, double b){
        return display.displayValue(a*b);
    }
    public double div(double a, double b) throws ArithmeticException{
        if (b == 0) {
            throw new ArithmeticException("Illegal argument! You can't divide by 0");
        }
        return display.displayValue(a/b);
    }
}
