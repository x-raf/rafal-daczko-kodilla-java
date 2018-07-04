package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuElement {
    public static int EMPTY = -1;
    private int value;
    private List<Integer> possiblities;

    public SudokuElement(){
        value = EMPTY;
        possiblities = new ArrayList<>();
        for (int i=1; i<10; i++){
            possiblities.add(i);
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public List<Integer> getPossiblities() {
        return possiblities;
    }
}
