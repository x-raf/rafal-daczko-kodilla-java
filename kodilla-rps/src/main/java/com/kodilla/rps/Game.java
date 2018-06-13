package com.kodilla.rps;

public class Game {


    private UserDialogs userDialogs = new UserDialogs();
    private String playerName = userDialogs.getUserName();

    public void getWinner(int numberOfRounds) {

        ComputerPlayer computerPlayer = new ComputerPlayer();

        while (numberOfRounds > 0 && numberOfRounds < 11) {
            int userChoice = userDialogs.getUserSelection();
            int computerChoice = computerPlayer.getComputerChoice();
            if (userChoice == computerChoice) {
                if (userChoice == 1) {
                    System.out.println("Tie! Both players choose Rock!");
                } else if (userChoice == 2) {
                    System.out.println("Tie! Both players choose Paper!");
                } else {
                    System.out.println("Tie! Both players choose Scissors!");
                }
            } else if (userChoice == 1) {
                if (computerChoice == 2) {
                    System.out.println(playerName + " choose Rock; Computer choose Paper.");
                    System.out.println("Computer wins!");
                } else {
                    System.out.println(playerName + " choose Rock; Computer choose Scissors.");
                    System.out.println(playerName + " wins!");
                }
            } else if (userChoice == 2) {
                if (computerChoice == 1) {
                    System.out.println(playerName + " choose Paper; Computer choose Rock.");
                    System.out.println(playerName + " wins!");
                } else {
                    System.out.println(playerName + " choose Paper; Computer choose Scissors.");
                    System.out.println("Computer wins!");
                }
            } else {
                if (computerChoice == 1) {
                    System.out.println(playerName + " choose Scissors; Computer choose Rock.");
                    System.out.println("Computer wins!");
                } else {
                    System.out.println(playerName + " choose Scissors; Computer choose Paper.");
                    System.out.println(playerName + " wins!");
                }
            }
            numberOfRounds--;
        }
    }
}