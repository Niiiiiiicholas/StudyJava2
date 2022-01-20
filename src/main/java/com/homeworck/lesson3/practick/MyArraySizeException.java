package com.homeworck.lesson3.practick;

public class MyArraySizeException extends RuntimeException {
    private int column;
    private int row;
    private String  value;

    public int getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    public String  getValue() {
        return value;
    }

    public MyArraySizeException(int column, int row, String [][]arr) {
        super("Invalid data in [" + arr.length + "; " + arr[row].length + "]");
        this.column = column;
        this.row = row;
        this.value = arr[column][row];
    }
}
