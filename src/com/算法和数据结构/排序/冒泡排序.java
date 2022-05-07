package com.算法和数据结构.排序;

import com.算法和数据结构.util.BaseUtil;
import sun.awt.windows.WPrinterJob;

import java.util.Base64;

/**
 * 9 4 3 2 1 7 5 6 8
 * 4 9 3 2 1 7 5 6 8
 * 4 3 9 2 1 7 5 6 8
 * 4 3 2 9 1 7 5 6 8
 * 4 3 2 1 9 7 5 6 8
 * 4 3 2 1 7 9 5 6 8
 * 4 3 2 1 7 5 9 6 8
 * 4 3 2 1 7 5 6 9 8
 * 4 3 2 1 7 5 6 8 9
 * 3 4 2 1 7 5 6 8 9
 * 3 2 4 1 7 5 6 8 9
 * 3 2 1 4 7 5 6 8 9
 * 3 2 1 4 7 5 6 8 9
 * 3 2 1 4 5 7 6 8 9
 * 3 2 1 4 5 6 7 8 9
 * 3 2 1 4 5 6 7 8 9
 * 2 3 1 4 5 6 7 8 9
 * 2 1 3 4 5 6 7 8 9
 * 2 1 3 4 5 6 7 8 9
 * 2 1 3 4 5 6 7 8 9
 * 2 1 3 4 5 6 7 8 9
 * 2 1 3 4 5 6 7 8 9
 * 1 2 3 4 5 6 7 8 9
 * 1 2 3 4 5 6 7 8 9
 * 1 2 3 4 5 6 7 8 9
 * 1 2 3 4 5 6 7 8 9
 * 1 2 3 4 5 6 7 8 9
 * 1 2 3 4 5 6 7 8 9
 * 1 2 3 4 5 6 7 8 9
 * 1 2 3 4 5 6 7 8 9
 * 1 2 3 4 5 6 7 8 9
 * 1 2 3 4 5 6 7 8 9
 * 1 2 3 4 5 6 7 8 9
 * 1 2 3 4 5 6 7 8 9
 * 1 2 3 4 5 6 7 8 9
 * 1 2 3 4 5 6 7 8 9
 * 1 2 3 4 5 6 7 8 9
 * 1 2 3 4 5 6 7 8 9
 */
public class 冒泡排序 {

    public static void BubbeSort(int [] arr){
        for(int i = arr.length-1;i>0;i--){
            for (int j = 0;j<i;j++){
                if(arr[j]>arr[j+1]) BaseUtil.swap(arr,j,j+1);
                BaseUtil.print(arr);
                System.out.println();
            }

        }
    }

    public static void main(String[] args) {

        int[] arr = {9,4,3,2,1,7,5,6,8};
        BaseUtil.print(arr);
        System.out.println();
        BubbeSort(arr);
        BaseUtil.print(arr);
    }

}

