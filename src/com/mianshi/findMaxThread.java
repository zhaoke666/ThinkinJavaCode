package com.mianshi;


import com.算法和数据结构.util.BaseUtil;

import java.util.concurrent.CountDownLatch;

/**
 * 寻找数组中的最大值，并且返回对应的下标
 */
public class findMaxThread {

    private static int INDEX = -1;

    public static int findMax(int [] nums){
        CountDownLatch countDownLatch = new CountDownLatch(nums.length);
        for (int i = 0; i < nums.length; i++) {
            final int j = i;
             new Thread(()->{
                 try {
                     Thread.sleep(nums[j]);
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
                 INDEX = j;
                 countDownLatch.countDown();
             }).start();
        }
        try{
            countDownLatch.await();
        }catch (Exception e){
            e.printStackTrace();
        }
        return INDEX;
    }

    /**
     * 多线程排序
     * @param nums
     */
    public static void sleepSort(int [] nums){

        for (int i = 0; i < nums.length; i++) {
            final int num = nums[i];
            final int j = i;
            new Thread(()->{
                try {
                    Thread.sleep(num);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print(num +",");
            }).start();
        }

    }

    public static void main(String[] args) {
        int [] arr = {43,12,23,15,32,401,32,51,54,89,2,5,3,6,8};
        System.out.println(findMax(arr));
        sleepSort(arr);
        System.out.println();

    }

}
