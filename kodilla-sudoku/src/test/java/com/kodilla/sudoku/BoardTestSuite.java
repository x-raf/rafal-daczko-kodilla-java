package com.kodilla.sudoku;

import org.junit.Test;

public class BoardTestSuite {

    public SudokuBoard initBoard(){
        SudokuBoard board = new SudokuBoard();
        //Tu wypełnić planszę przykładowym sudoku
        board.setValue(1,1,8);
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
        return board;
    }
    @Test
    public void testSudokuBoard(){
        SudokuBoard board = initBoard();
        System.out.println(board);
    }
}
