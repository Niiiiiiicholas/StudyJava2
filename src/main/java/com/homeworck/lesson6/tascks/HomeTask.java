package com.homeworck.lesson6.tascks;

import java.util.Arrays;

public class HomeTask {

    public static void main(String[] args) {
    //oneThreadTask();
    twoThreadTask();

    }
    public static void oneThreadTask(){
        final int ARRAY_SIZE = 1_000_000;
        final int HALF_ARRAY_SIZE = ARRAY_SIZE/ 2;
        float[] arr = new float[ARRAY_SIZE];
        Arrays.fill(arr, 1.0f);
        long timeStart = System.currentTimeMillis();
        for(int i = 0; i < arr.length; i++){
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i/5) * Math.cos(0.2f + i/5) * Math.cos((0.4f + i/2)));
         }

        System.out.println("time: " + (System.currentTimeMillis() - timeStart));
    }
    public static void twoThreadTask(){
        final int ARRAY_SIZE = 1_000_000;
        final int HALF_ARRAY_SIZE = ARRAY_SIZE/ 2;
        float[] arr = new float[ARRAY_SIZE];
        Arrays.fill(arr, 1.0f);
        long timeStart = System.currentTimeMillis();
        float[] leftArray = new float[HALF_ARRAY_SIZE];
        float[] rightArray = new float[HALF_ARRAY_SIZE];
        System.arraycopy(arr,0, leftArray, 0, HALF_ARRAY_SIZE );
        System.arraycopy(arr,HALF_ARRAY_SIZE, rightArray, 0, HALF_ARRAY_SIZE );
        Thread threadLeft =  new Thread(() -> {
            for(int i = 0; i < arr.length; i++) {
                leftArray[i] = (float) (leftArray[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos((0.4f + i / 2)));
            }
        });
        Thread threadRight =  new Thread(() -> {
            for(int i = 0, j = HALF_ARRAY_SIZE; i < arr.length; i++, j++) {
                rightArray[i] = (float) (rightArray[i] * Math.sin(0.2f + j / 5) * Math.cos(0.2f +  j/ 5) * Math.cos((0.4f + j / 2)));
            }
        });

        threadLeft.start();
        threadRight.start();
        try {
            threadLeft.join();
            threadRight.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.arraycopy(leftArray,0, arr, 0, HALF_ARRAY_SIZE );
        System.arraycopy(rightArray,0, arr, HALF_ARRAY_SIZE, HALF_ARRAY_SIZE );


        System.out.println("time: " + (System.currentTimeMillis() - timeStart));
    }

}
