package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.reference.FunctionalCalculator;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;

public class StreamMain {
    public static void main(String[] args) {
        System.out.println("Welcome to module 7 - Stream");

        Processor processor = new Processor();
        Executor codeToExecute = () -> System.out.println("\nThis is sample text.");
        processor.execute(codeToExecute);

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("\nCalculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("\nCalculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        System.out.println("\nMaking text beautiful!");
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String textBeauty = poemBeautifier.beautify(".Testowy tekst.",string ->"ABC" + string + "ABC");
        String textBeauty1 = poemBeautifier.beautify("Testowy tekst",string ->string.toUpperCase());
        String textBeauty2 = poemBeautifier.beautify("TESTOWY TEKST",string ->string.toLowerCase());
        String textBeauty3 = poemBeautifier.beautify("Testowy tekst",string ->string.replace('t','*'));
        System.out.println(textBeauty + "\n" + textBeauty1 + "\n" + textBeauty2 + "\n" + textBeauty3);
    }
}
