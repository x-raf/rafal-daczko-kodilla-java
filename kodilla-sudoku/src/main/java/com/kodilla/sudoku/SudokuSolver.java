package com.kodilla.sudoku;

import static com.kodilla.sudoku.SudokuElement.EMPTY;

public class SudokuSolver {

    private static final int BOARD_SIZE = 10;
    private static final int SUBSECTION_SIZE = 3;
    private static final int BOARD_START_INDEX = 1;


    public void resolveSudoku(SudokuBoard sudokuBoard) {
        boolean changed = true;
        Integer currentValue;
        while (changed) {
            changed = false;
            for (int row = BOARD_START_INDEX; row < BOARD_SIZE; row++) {
                for (int column = BOARD_START_INDEX; column < BOARD_SIZE; column++) {
                    currentValue = sudokuBoard.getValue(row, column);
                    if (currentValue == EMPTY) {
                        clearPossibilities(row, column, sudokuBoard);
                        if (sudokuBoard.getPossibilities(row, column).size() == 1) {
                            sudokuBoard.setValue(row, column, sudokuBoard.getPossibilities(row, column).get(0));
                            changed = true;
                        }
                    }
                }
            }
        }
    }

    private void clearPossibilities(int row, int column, SudokuBoard sudokuBoard) {
        for (int n=BOARD_START_INDEX; n<BOARD_SIZE; n++) {
            Integer val = sudokuBoard.getValue(row,n);
            sudokuBoard.getPossibilities(row, column).remove(val);
        }
        for (int n=BOARD_START_INDEX; n<BOARD_SIZE; n++) {
            Integer val = sudokuBoard.getValue(n,column);
            sudokuBoard.getPossibilities(row, column).remove(val);
        }
        int x = (column -1) /SUBSECTION_SIZE;
        int y = (row -1) /SUBSECTION_SIZE;
        for (int r = y*3 +1; r<y*3+SUBSECTION_SIZE +1; r++) {
            for (int c = x*3 +1; c < x*3+SUBSECTION_SIZE +1; c++){
                Integer val = sudokuBoard.getValue(r,c);
                sudokuBoard.getPossibilities(row, column).remove(val);
            }
        }
    }
}
