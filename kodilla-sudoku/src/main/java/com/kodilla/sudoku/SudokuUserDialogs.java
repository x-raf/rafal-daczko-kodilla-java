package com.kodilla.sudoku;

import java.util.Scanner;

public class SudokuUserDialogs {

    public static SudokuItem getItem() {
        System.out.println("Input your guess(in format:row,column,value): ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String [] coordinates = userInput.split("");
        int x = Integer.parseInt(coordinates[0]);
        int y = Integer.parseInt(coordinates[1]);
        int value = Integer.parseInt(coordinates[2]);
        SudokuItem sudokuItem = new SudokuItem(x,y,value);
        return sudokuItem;
    }
}
