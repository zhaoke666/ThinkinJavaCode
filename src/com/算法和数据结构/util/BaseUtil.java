package com.算法和数据结构.util;

public class BaseUtil {


    public static void print(int [] arr){
        for (int i= 0 ;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void swap(int [] arr, int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
