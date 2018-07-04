package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuRow {
    private List<SudokuElement> columns;

    public List<SudokuElement> getColumns() {
        return columns;
    }

    public SudokuRow() {
        columns = new ArrayList<>();
        for (int n=1; n<10; n++){
            columns.add(new SudokuElement());
        }
    }
}
