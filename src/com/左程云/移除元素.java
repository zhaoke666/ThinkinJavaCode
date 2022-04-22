package com.左程云;

/**
 *
 * @param nums
 * @param val
 * @return
 */

public class 移除元素 {

    public static int removeElement(int[] nums, int val) {
        // 利用两个指针 右指针  指向当前将要处理的元素，左指针 k 指向下一个将要赋值的位置。
        //如果右指针指向的元素不等于 val，它一定是输出数组的一个元素，
        //我们就将右指针指向的元素复制到左指针位置，然后将左右指针同时右移；
        //如果右指针指向的元素等于 val，它不能在输出数组里，此时左指针不动，右指针右移一位。
        int k = 0;
        for (int i = 0; i<nums.length;i++){
            if( nums[i] != val) {
               nums[k] = nums[i];
                k++;
            }

        }
        return k ;
    }

    public static void main(String[] args) {
        int [] aa = {0,1,2,2,3,0,4,2};
        int resuilt = removeElement(aa,2);
        System.out.println(removeElement(aa,2));
        for (int i = 0; i < resuilt; i++) {
            System.out.print(aa[i]+" ");
        }
    }
}
