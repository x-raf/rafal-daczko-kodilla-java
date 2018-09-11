package com.kodilla.sudoku;

import static com.kodilla.sudoku.SudokuElement.EMPTY;

public class SudokuSolver {

    public static final int BOARD_SIZE = 10;
    public static final int SUBSECTION_SIZE = 3;
    public static final int BOARD_START_INDEX = 1;


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
                        if (!changed) {
                            Integer possibleOnlyHere = isPossibleOnlyHere(row, column, sudokuBoard);
                            if (possibleOnlyHere > 0) {
                                sudokuBoard.setValue(row, column, possibleOnlyHere);
                                changed = true;
                            }
                        }
                    }
                }
            }
        }
    }

    private Integer isPossibleOnlyHere(int row, int column, SudokuBoard sudokuBoard) {
        for (Integer possibility : sudokuBoard.getPossibilities(row, column)) {
            boolean result = true;
            for (int n = BOARD_START_INDEX; n < BOARD_SIZE; n++) {
                Integer val = sudokuBoard.getValue(row, n);
                if (val == -1 && sudokuBoard.getPossibilities(row, n).contains(possibility) &&
                        (n != column)) result = false;
            }
            for (int n = BOARD_START_INDEX; n < BOARD_SIZE; n++) {
                Integer val = sudokuBoard.getValue(n, column);
                if (val == -1 && sudokuBoard.getPossibilities(n, column).contains(possibility) &&
                        (n != row)) result = false;
            }
            int x = (column - 1) / SUBSECTION_SIZE;
            int y = (row - 1) / SUBSECTION_SIZE;
            for (int r = y * 3 + 1; r < y * 3 + SUBSECTION_SIZE + 1; r++) {
                for (int c = x * 3 + 1; c < x * 3 + SUBSECTION_SIZE + 1; c++) {
                    Integer val = sudokuBoard.getValue(r, c);
                    if (val == -1 && sudokuBoard.getPossibilities(r, c).contains(possibility) &&
                            (r != row || c != column)) result = false;
                }
            }
            if (result) {
                return possibility;
            }
        }
        return -1;
    }

    private void clearPossibilities(int row, int column, SudokuBoard sudokuBoard) {
        for (int n = BOARD_START_INDEX; n < BOARD_SIZE; n++) {
            Integer val = sudokuBoard.getValue(row, n);
            sudokuBoard.getPossibilities(row, column).remove(val);
        }
        for (int n = BOARD_START_INDEX; n < BOARD_SIZE; n++) {
            Integer val = sudokuBoard.getValue(n, column);
            sudokuBoard.getPossibilities(row, column).remove(val);
        }
        int x = (column - 1) / SUBSECTION_SIZE;
        int y = (row - 1) / SUBSECTION_SIZE;
        for (int r = y * 3 + 1; r < y * 3 + SUBSECTION_SIZE + 1; r++) {
            for (int c = x * 3 + 1; c < x * 3 + SUBSECTION_SIZE + 1; c++) {
                Integer val = sudokuBoard.getValue(r, c);
                sudokuBoard.getPossibilities(row, column).remove(val);
            }
        }
    }
}
