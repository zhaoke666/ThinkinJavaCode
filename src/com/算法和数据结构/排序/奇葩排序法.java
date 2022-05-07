package com.算法和数据结构.排序;


import com.google.common.primitives.Ints;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 非常奇葩的
 */
public class 奇葩排序法 {


    //运气排序法
    public static void monkeySort(int [] nums){
        //利用google的插件将数组转换为list
        List<Integer> integers = Ints.asList(nums);
        int[] result = new int [nums.length];
      out: while (true) {
           Collections.shuffle(integers);
          result = Ints.toArray(integers);
          //判断当前集合是否有序
           for (int i = 0; i < result.length; i++) {
               if (result[i] > result[i + 1]) {
                   continue out;
               }
           }
           //如果证明了是有序的,将result的值赋给nums
           System.arraycopy(result,0,nums,0,nums.length);
           break;
       }
    }

    //多线程排序
    public static void sleepSort(int [] nums){
        int [] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            final int num = nums[i];
            final int j = i;
            new Thread(()->{
                try {
                    //为了避免数值相差不大而导致错误,需要增加睡眠时间
                    Thread.sleep(num*10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                result[j] = num;
                System.out.print(num +",");
            }).start();
        }
        System.arraycopy(result,0,nums,0,nums.length);

    }


    public static void main(String[] args) {
        int [] arr = {43,12,23,15,32,401,32,51,54,89,2,5,3,6,8};
        sleepSort(arr);
        //System.out.println(Arrays.toString(arr));

    }

}
