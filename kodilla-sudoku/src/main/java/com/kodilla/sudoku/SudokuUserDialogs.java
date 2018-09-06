package com.kodilla.sudoku;

import java.util.Scanner;

public class SudokuUserDialogs {
    private static final Scanner scanner = new Scanner(System.in);


    public static SudokuItem getItem() {
        while (true) {
            System.out.println("Input your guess(in format: RCV where R-row,C-column,V-value) or (E)xample or (Q)uit or (R)esolve: ");

            String userInput = scanner.nextLine();
            try {
                if(userInput.toUpperCase().equals("E")) {
                    return new SudokuItem(0,0,0,UserAction.EXAMPLE);
                }else if(userInput.toUpperCase().equals("Q")) {
                    return new SudokuItem(0,0,0,UserAction.QUIT);
                }else if(userInput.toUpperCase().equals("R")) {
                    return new SudokuItem(0,0,0,UserAction.RESOLVE);
                }else if(userInput.length()!=3) {
                    throw new Exception();
                }
                String[] coordinates = userInput.split("");
                int x = Integer.parseInt(coordinates[0]);
                int y = Integer.parseInt(coordinates[1]);
                int value = Integer.parseInt(coordinates[2]);
                if(value==0 || x==0 || y==0) {
                    throw new Exception();
                }
                SudokuItem sudokuItem = new SudokuItem(x, y, value);
                return sudokuItem;
            }catch (Exception e) {
                System.out.println("Wrong data!");
            }
        }
    }
}
