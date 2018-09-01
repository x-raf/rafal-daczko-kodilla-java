package com.kodilla.sudoku;

public class SudokuGame {

    public static void main(String[] args) {
        SudokuBoard board = new SudokuBoard();

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

        System.out.println(board);

        boolean finished = false;
        while(!finished) {
            SudokuItem newItem = SudokuUserDialogs.getItem();
            if(newItem.getValue() == 0) {
                finished = true;
            } else {
                board.setValue(newItem.getX(), newItem.getY(), newItem.getValue());
                System.out.println(board);
            }
        }
        SudokuSolver solver = new SudokuSolver();
        solver.resolveSudoku(board);
        System.out.println(board);
    }
}
