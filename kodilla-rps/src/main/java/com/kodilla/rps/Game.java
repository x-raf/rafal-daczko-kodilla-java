package com.kodilla.rps;

public class Game {

    private int playerPoints;
    private int computerPoints;
    private UserDialogs userDialogs = new UserDialogs();
    private String playerName = userDialogs.getUserName();
    private int round;

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
                    computerPoints++;
                } else {
                    System.out.println(playerName + " choose Rock; Computer choose Scissors.");
                    System.out.println(playerName + " wins!");
                    playerPoints++;
                }
            } else if (userChoice == 2) {
                if (computerChoice == 1) {
                    System.out.println(playerName + " choose Paper; Computer choose Rock.");
                    System.out.println(playerName + " wins!");
                    playerPoints++;
                } else {
                    System.out.println(playerName + " choose Paper; Computer choose Scissors.");
                    System.out.println("Computer wins!");
                    computerPoints++;
                }
            } else {
                if (computerChoice == 1) {
                    System.out.println(playerName + " choose Scissors; Computer choose Rock.");
                    System.out.println("Computer wins!");
                    computerPoints++;
                } else {
                    System.out.println(playerName + " choose Scissors; Computer choose Paper.");
                    System.out.println(playerName + " wins!");
                    playerPoints++;
                }
            }
            round++;
            System.out.println("Round number: " + round);
            System.out.println(playerName + ": " + playerPoints + " points. Computer: " + computerPoints + " points.");
            numberOfRounds--;
        }
        if (playerPoints > computerPoints) {
            System.out.println(playerName + " wins!");
        }else if (playerPoints == computerPoints){
            System.out.println("Tie!");
        }else {
            System.out.println("Computer wins!");
        }
    }
}