package com.kodilla.sudoku;

import java.util.stream.IntStream;

import static com.kodilla.sudoku.SudokuElement.EMPTY;

public class SudokuSolverV2 {

    private static final int BOARD_SIZE = 10;
    private static final int SUBSECTION_SIZE = 3;
    private static final int BOARD_START_INDEX = 1;

    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 9;

    public boolean solve(SudokuBoard sudokuBoard) {
        Integer currentVal;
        for (int row = BOARD_START_INDEX; row < BOARD_SIZE; row++) {
            for (int column = BOARD_START_INDEX; column < BOARD_SIZE; column++) {
                currentVal = sudokuBoard.getValue(row, column);
                if (currentVal == EMPTY) {
                    for (int k = MIN_VALUE; k <= MAX_VALUE; k++) {
                        currentVal = k;
                        if (isValid(sudokuBoard,row,column) && solve(sudokuBoard)) {
                            return true;
                        }
                        currentVal = EMPTY;
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValid(SudokuBoard sudokuBoard, int row, int column) {
        return (rowConstraint(sudokuBoard, row)
                && columnConstraint(sudokuBoard, column)
                && subsectionConstraint(sudokuBoard, row, column));
    }

    private boolean rowConstraint(SudokuBoard sudokuBoard, int row) {
        boolean[] constraint = new boolean[BOARD_SIZE];
        return IntStream.range(BOARD_START_INDEX, BOARD_SIZE)
                .allMatch(column -> checkConstraint(sudokuBoard, row, constraint, column));
    }

    private boolean columnConstraint(SudokuBoard sudokuBoard, int column) {
        boolean[] constraint = new boolean[BOARD_SIZE];
        return IntStream.range(BOARD_START_INDEX, BOARD_SIZE)
                .allMatch(row -> checkConstraint(sudokuBoard, row, constraint, column));
    }

    private boolean subsectionConstraint(SudokuBoard sudokuBoard, int row, int column) {
        boolean[] constraint = new boolean[BOARD_SIZE];
        int subsectionRowStart = (row / SUBSECTION_SIZE) * SUBSECTION_SIZE +1;
        int subsectionRowEnd = subsectionRowStart + SUBSECTION_SIZE +1;

        int subsectionColumnStart = (column / SUBSECTION_SIZE) * SUBSECTION_SIZE +1;
        int subsectionColumnEnd = subsectionColumnStart + SUBSECTION_SIZE +1;

        for (int r = subsectionRowStart; r < subsectionRowEnd; r++) {
            for (int c = subsectionColumnStart; c < subsectionColumnEnd; c++) {
                if (!checkConstraint(sudokuBoard, r, constraint, c)) return false;
            }
        }
        return true;
    }

    boolean checkConstraint(SudokuBoard sudokuBoard, int row, boolean[] constraint, int column) {
        if (sudokuBoard.getValue(row,column) != EMPTY) {
            if (!constraint[sudokuBoard.getValue(row,column) -1]) {
                constraint[sudokuBoard.getValue(row,column) -1] = true;
            } else {
                return false;
            }
        }
        return true;
    }
}
