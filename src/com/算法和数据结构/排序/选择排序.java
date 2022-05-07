package com.算法和数据结构.排序;


import com.算法和数据结构.util.BaseUtil;

/**
 * 时间复杂度：O(n^2)
 * 空间复杂度：O(1)
 * 稳定型：不稳定
 */
public class 选择排序 {

    public static void main(String[] args) {
        int [] arr = {5,3,1,2,4,9,7,5,8,11,10};
          selectSort_2(arr);
        }



    public static void selectSort_1(int [] arr){
        BaseUtil.print(arr);
        for (int i = 0;i<arr.length -1 ;i++){
            int minpos = i;
            for (int j = i +1;j<arr.length;j++){
                minpos = arr[j]< arr[minpos]? j : minpos;
            }
            BaseUtil.swap(arr,i,minpos);
            System.out.println();
            System.out.print("经过"+ (i+1) + "次循环之后，数据的内容");
            BaseUtil.print(arr);
       }
    }

    public static void selectSort_2(int [] arr){
        BaseUtil.print(arr);
        for (int i  = 0; i<(arr.length)/2;i++){
            int minpos  = i;
            int maxpos = i;
            int pos = arr.length - (i + 1);
            for (int j = i+1; j<arr.length;j++){
                minpos = arr[minpos]<arr[j]?minpos:j;
            }
            for (int k = pos ; k>i; k--){
                maxpos = arr[maxpos]>arr[k]?maxpos:k;
            }
            BaseUtil.swap(arr,i,minpos);
            BaseUtil.swap(arr,pos,maxpos);
            System.out.println();
            System.out.print("经过"+ (i+1) + "次循环之后，数据的内容");
            BaseUtil.print(arr);

        }

    }



}
