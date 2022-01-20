package com.homeworck.lesson3;

public class MyLibMatrixProcessingException extends RuntimeException {
    private int row;
    private int column;
    private int value;

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public int getValue() {
        return value;
    }

    public MyLibMatrixProcessingException(int column, int row, int[] [] array) {
        super("Invalid data in [" + column + "; " + row + "]: " + array[column] [row]);
        this.row = row;
        this.column = column;
        this.value = array[column] [row];
    }
}
