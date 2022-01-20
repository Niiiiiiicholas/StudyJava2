package com.homeworck.lesson4.Path2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        Integer[] list = {1,2,3,4,5,6};
        Integer[] list2 = {7,8,9,0,10,11};

        //замена 5 значения в массиве на 2, а 2 на 5
//        swap(list, 4, 1);
//        for (Integer l : list){
//            System.out.println(l);
//        }

        //Создание list и переноса данных в него из list2
        List list3 =  convertToList(list2);
        for (int i = 0; i < list3.size(); i++){
            System.out.println(list3.get(i));
        }
    }
    public static void swap(Object[] arr, int n1, int n2){
        Object obj = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = obj;
    }
    public static <T> ArrayList<T> convertToList(T[] array){
        return new ArrayList<>(Arrays.asList(array));
    }
}
