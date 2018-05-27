package com.kodilla.exception.test;

public class SecondChallenge {
    public String probablyIWillThrowException(double x, double y) throws ExceptionHandling {
        if(x >= 2 || x < 1 || y == 1.5) {
            throw new ExceptionHandling();
        }
        return "Done!";
    }

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            String resultSecondChallenge = secondChallenge.probablyIWillThrowException(3,1.5);
            System.out.println(resultSecondChallenge);
        }catch (ExceptionHandling e) {
            System.out.println("Znaleziono wyjątek: " + e);
        }finally {
            System.out.println("Złe wartości zmiennych: x >= 2 || x < 1 || y == 1.5");
        }
    }
}
