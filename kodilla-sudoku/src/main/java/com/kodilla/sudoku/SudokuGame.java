package com.kodilla.sudoku;

import static com.kodilla.sudoku.SudokuSolver.BOARD_SIZE;
import static com.kodilla.sudoku.SudokuSolver.BOARD_START_INDEX;
import static com.kodilla.sudoku.SudokuSolver.SUBSECTION_SIZE;
import static com.kodilla.sudoku.UserAction.EXAMPLE;
import static com.kodilla.sudoku.UserAction.QUIT;
import static com.kodilla.sudoku.UserAction.RESOLVE;

public class SudokuGame {

    public static void main(String[] args) {
        SudokuBoard board = new SudokuBoard();

        boolean finished = false;
        while(!finished) {
            System.out.println(board);
            SudokuItem newItem = SudokuUserDialogs.getItem();
            if(newItem.getUserAction()==EXAMPLE){
                fillExampleData(board);
            }else if(newItem.getUserAction()==QUIT) {
                finished = true;
            }else if(newItem.getUserAction()==RESOLVE) {
                SudokuSolver solver = new SudokuSolver();
                solver.resolveSudoku(board);
                System.out.println(board);
                finished = true;
            }else {
                if(isValuePossible(newItem.getX(), newItem.getY(), newItem.getValue(),board)) {
                    board.setValue(newItem.getX(), newItem.getY(), newItem.getValue());
                    System.out.println(board);
                }else {
                    SudokuUserDialogs.showError();
                }
            }
        }
    }

    private static boolean isValuePossible(int row, int column, int value, SudokuBoard sudokuBoard) {
        boolean result = true;
        for (int n = BOARD_START_INDEX; n < BOARD_SIZE; n++) {
            Integer val = sudokuBoard.getValue(row, n);
            if(value == val) result = false;
        }
        for (int n = BOARD_START_INDEX; n < BOARD_SIZE; n++) {
            Integer val = sudokuBoard.getValue(n, column);
            if(value == val) result = false;
        }
        int x = (column - 1) / SUBSECTION_SIZE;
        int y = (row - 1) / SUBSECTION_SIZE;
        for (int r = y * 3 + 1; r < y * 3 + SUBSECTION_SIZE + 1; r++) {
            for (int c = x * 3 + 1; c < x * 3 + SUBSECTION_SIZE + 1; c++) {
                Integer val = sudokuBoard.getValue(r, c);
                if(value == val) result = false;
            }
        }
        return result;
    }

    private static void fillExampleData(SudokuBoard board) {
        //Medium sudoku
        board.setValue(1, 4, 2);
        board.setValue(1, 9, 3);
        board.setValue(2, 2, 7);
        board.setValue(2, 5, 9);
        board.setValue(2, 7, 2);
        board.setValue(3, 2, 6);
        board.setValue(3, 3, 1);
        board.setValue(3, 4, 5);
        board.setValue(3, 5, 8);
        board.setValue(3, 8, 4);
        board.setValue(3, 9, 9);
        board.setValue(4, 1, 8);
        board.setValue(4, 6, 4);
        board.setValue(4, 9, 1);
        board.setValue(6, 1, 7);
        board.setValue(6, 4, 8);
        board.setValue(6, 9, 4);
        board.setValue(7, 1, 5);
        board.setValue(7, 2, 9);
        board.setValue(7, 5, 7);
        board.setValue(7, 6, 8);
        board.setValue(7, 7, 3);
        board.setValue(7, 8, 1);
        board.setValue(8, 3, 4);
        board.setValue(8, 5, 3);
        board.setValue(8, 8, 5);
        board.setValue(9, 1, 6);
        board.setValue(9, 6, 1);
    }
}
