package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.sudoku.SudokuElement.EMPTY;

public class SudokuBoard {

    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 9;

    private List<SudokuRow> rows;

    public List<SudokuRow> getRows() {
        return rows;
    }

    public SudokuBoard() {
        rows = new ArrayList<>();
        for (int k=1; k<10; k++){
            rows.add(new SudokuRow());
        }
    }
    public void setValue(int row, int column, int value){
        rows.get(row -1).getColumns().get(column -1).setValue(value);
    }
    public int getValue(int row, int column){
        return rows.get(row -1).getColumns().get(column -1).getValue();
    }
    public List<Integer> getPossibilities(int row, int column){
        return rows.get(row -1).getColumns().get(column -1).getPossiblities();
    }

    @Override
    public String toString() {
        String a = new String(new char[41]).replace("\0",("\u2500"));
        String b = new String(new char[41]).replace("\0",("\u2501"));
        String s =  "  " + b + "\n";
        int x = 0;
        System.out.println("   1   2   3   4   5   6   7   8   9");
        for(int row = MIN_VALUE; row <= MAX_VALUE; row++){
            x++;
            s+= x + " \u2551";
            for(int col = MIN_VALUE; col <= MAX_VALUE; col++){
                s+=" ";
                int val = getValue(row,col);
                s+= val == EMPTY ? " ": val;
                if (col < MAX_VALUE && col%3 != 0) {
                    s+= " \u2502";
                }else {
                    s+= " \u2551";
                }
            }
            s+="  " + "\n";
            if (row < MAX_VALUE && row%3 != 0){
                s += "  " + a + "\n";
            }else if(row < MAX_VALUE && row%3 ==0 && row != MAX_VALUE){
                s+= "  " + b + "\n";
            }else {
                s += "  " + b + "\n";
            }
        }
        return s;
    }
}
