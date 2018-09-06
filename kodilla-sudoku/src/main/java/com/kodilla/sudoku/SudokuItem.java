package com.kodilla.sudoku;

public class SudokuItem {
    private int x;
    private int y;
    private int value;
    private UserAction userAction;

    public SudokuItem(int x, int y, int value, UserAction userAction) {
        this.x = x;
        this.y = y;
        this.value = value;
        this.userAction = userAction;
    }

    public SudokuItem(int x, int y, int value) {
        this.x = x;
        this.y = y;
        this.value = value;
        this.userAction = UserAction.NEW_ITEM;
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

    public UserAction getUserAction() {
        return userAction;
    }
}
