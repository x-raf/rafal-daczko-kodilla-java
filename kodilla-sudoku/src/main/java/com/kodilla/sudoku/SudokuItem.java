package com.kodilla.sudoku;

public class SudokuItem {
    private int x;
    private int y;
    private int value;

    public SudokuItem(int x, int y, int value) {
        this.x = x;
        this.y = y;
        this.value = value;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getValue() {
        return value;
    }
}
