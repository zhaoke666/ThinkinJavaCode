package com.算法和数据结构.排序;

import com.算法和数据结构.util.BaseUtil;

/**
 * 9 4 3 2 1 7 5 6 8
 * 4 9 3 2 1 7 5 6 8
 * 4 3 9 2 1 7 5 6 8
 * 3 4 9 2 1 7 5 6 8
 * 3 4 2 9 1 7 5 6 8
 * 3 2 4 9 1 7 5 6 8
 * 2 3 4 9 1 7 5 6 8
 * 2 3 4 1 9 7 5 6 8
 * 2 3 1 4 9 7 5 6 8
 * 2 1 3 4 9 7 5 6 8
 * 1 2 3 4 9 7 5 6 8
 * 1 2 3 4 7 9 5 6 8
 * 1 2 3 4 7 5 9 6 8
 * 1 2 3 4 5 7 9 6 8
 * 1 2 3 4 5 7 6 9 8
 * 1 2 3 4 5 6 7 9 8
 * 1 2 3 4 5 6 7 8 9
 * 1 2 3 4 5 6 7 8 9
 */

public class 插入排序 {

        public static void InsertSort(int [] arr){
            for (int i = 1; i<arr.length;i++){
                for (int j =i;j>0&&arr[j]<arr[j-1];j--){
                    BaseUtil.swap(arr,j,j-1);
                    BaseUtil.print(arr);
                    System.out.println();
                }
            }
        }

        public static void main(String[] args) {

            int[] arr = {9,4,3,2,1,7,5,6,8};
            BaseUtil.print(arr);
            System.out.println();
            InsertSort(arr);
            BaseUtil.print(arr);
        }
}
