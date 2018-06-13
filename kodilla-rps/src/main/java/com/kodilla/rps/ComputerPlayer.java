package com.kodilla.rps;

import java.util.Random;

public class ComputerPlayer {

    public int getComputerChoice() {
        Random random = new Random();
        int computerChoice = random.nextInt(3) + 1;
        return computerChoice;
    }
}