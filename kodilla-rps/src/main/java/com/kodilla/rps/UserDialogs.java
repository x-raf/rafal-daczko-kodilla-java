package com.kodilla.rps;

import java.util.Scanner;

public class UserDialogs {

    private Scanner scanner = new Scanner(System.in);
    private boolean end = false;

    public String getUserName() {
        System.out.println("Please enter your name:");
        String playerName = scanner.nextLine();
        return playerName;
    }

    public int getUserSelection() {
        while (true) {
            System.out.println("Enter your move (1 = Rock, 2 = Paper, 3 = Scissors):");
            int userChoice = scanner.nextInt();

            if (userChoice < 1 || userChoice > 3) {
                System.out.println("Invalid move!");
            } else {
                return userChoice;
            }
        }
    }

    public int getNumberOfRounds() {
        while (true) {
            System.out.println("How many round you want to play? Enter value from 1 to 10: ");
            int numberOfRounds = scanner.nextInt();
            if (numberOfRounds <= 0 || numberOfRounds > 10) {
                System.out.println("Choose number of rounds from given range!");
            } else {
                return numberOfRounds;
            }
        }
    }

    public boolean endSelection() {

        System.out.println("What's next, finish? Press x");
        System.out.println("New game? Press n");
        Scanner inputValue = new Scanner(System.in);
        String input = inputValue.nextLine();
        if (input.equals("n")) {
             end = false;
        } else if (input.equals("x")) {
             end = true;
            System.exit(0);
        } else {
            System.out.println("Input correct value!");
            inputValue.nextLine();
        }
        return end;
    }
}