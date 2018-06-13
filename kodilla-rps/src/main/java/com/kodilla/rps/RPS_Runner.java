package com.kodilla.rps;

public class RPS_Runner {
    public static void main(String[] args) {

        boolean end = false;

        System.out.println("Welcome to Rock,Paper,Scissors game!");
        UserDialogs userDialogs = new UserDialogs();
        Game game = new Game();

        while (!end) {
            game.getWinner(userDialogs.getNumberOfRounds());
            userDialogs.endSelection();
        }
    }
}