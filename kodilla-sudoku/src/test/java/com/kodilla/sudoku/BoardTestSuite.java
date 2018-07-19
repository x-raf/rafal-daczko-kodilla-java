package com.kodilla.sudoku;

import org.junit.Test;

public class BoardTestSuite {

    public SudokuBoard initBoard() {
        SudokuBoard board = new SudokuBoard();
        //Tu wypełnić planszę przykładowym sudoku

        //World hardest sudoku
        /*board.setValue(1,1,8);
        board.setValue(2,3,3);
        board.setValue(2,4,6);
        board.setValue(3,2,7);
        board.setValue(3,5,9);
        board.setValue(3,7,2);
        board.setValue(4,2,5);
        board.setValue(4,6,7);
        board.setValue(5,5,4);
        board.setValue(5,6,5);
        board.setValue(5,7,7);
        board.setValue(6,4,1);
        board.setValue(6,8,3);
        board.setValue(7,3,1);
        board.setValue(7,8,6);
        board.setValue(7,9,8);
        board.setValue(8,3,8);
        board.setValue(8,4,5);
        board.setValue(8,8,1);
        board.setValue(9,2,9);
        board.setValue(9,7,4);
        return board;*/

        /*
        World hardest sudoku solution

        8 1 2 7 5 3 6 4 9
        9 4 3 6 8 2 1 7 5
        6 7 5 4 9 1 2 8 3
        1 5 4 2 3 7 8 9 6
        3 6 9 8 4 5 7 2 1
        2 8 7 1 6 9 5 3 4
        5 2 1 9 7 4 3 6 8
        4 3 8 5 2 6 9 1 7
        7 9 6 3 1 8 4 5 2
        */

        //Easy Sudoku
        board.setValue(1, 4, 2);
        board.setValue(1, 5, 6);
        board.setValue(1, 7, 7);
        board.setValue(1, 9, 1);
        board.setValue(2, 1, 6);
        board.setValue(2, 2, 8);
        board.setValue(2, 5, 7);
        board.setValue(2, 8, 9);
        board.setValue(3, 1, 1);
        board.setValue(3, 2, 9);
        board.setValue(3, 6, 4);
        board.setValue(3, 7, 5);
        board.setValue(4, 1, 8);
        board.setValue(4, 2, 2);
        board.setValue(4, 4, 1);
        board.setValue(4, 8, 4);
        board.setValue(5, 3, 4);
        board.setValue(5, 4, 6);
        board.setValue(5, 6, 2);
        board.setValue(5, 7, 9);
        board.setValue(6, 2, 5);
        board.setValue(6, 6, 3);
        board.setValue(6, 8, 2);
        board.setValue(6, 9, 8);
        board.setValue(7, 3, 9);
        board.setValue(7, 4, 3);
        board.setValue(7, 8, 7);
        board.setValue(7, 9, 4);
        board.setValue(8, 2, 4);
        board.setValue(8, 5, 5);
        board.setValue(8, 8, 3);
        board.setValue(8, 9, 6);
        board.setValue(9, 1, 7);
        board.setValue(9, 3, 3);
        board.setValue(9, 5, 1);
        board.setValue(9, 6, 8);
        return board;
    }

    @Test
    public void testSudokuBoard() {
        SudokuBoard board = initBoard();
        System.out.println(board);
        SudokuSolver solver = new SudokuSolver();
        solver.resolveSudoku(board);

        System.out.println(board);
    }
}
