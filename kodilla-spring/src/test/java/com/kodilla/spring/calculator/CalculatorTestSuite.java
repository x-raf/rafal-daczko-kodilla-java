package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double add = calculator.add(10,5);
        double sub = calculator.sub(15,5);
        double mul = calculator.mul(5,3);
        double div = calculator.div(15,3);
        //Then
        Assert.assertEquals(15, add,0.001);
        Assert.assertEquals(10, sub,0.001);
        Assert.assertEquals(15, mul,0.001);
        Assert.assertEquals(5, div,0.001);
    }
}
