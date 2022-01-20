package com.homeworck.lesson3.practick;

public class Starting {
    public static void main(String[] args) {
        String [][] arr = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "1g1", "12"},
                {"13", "14", "15", "16"}
        };
        doSum(arr);

    }

    public static void doSum(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr.length > 4 || arr[j].length > 4) {
                    throw new MyArraySizeException(i, j, arr);
                }
                try {
                    int a = Integer.parseInt(arr[i][j]);
                    sum = sum + a;
                }catch (Exception e){
                    throw new MyArrayDataException(i, j, arr);
                }
            }
        }
        System.out.println(sum);
    }
}
