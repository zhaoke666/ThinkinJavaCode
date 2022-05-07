package com.leetcode;

public class 有序数组 {

    public static int removeDuplicates(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[index+1]) {
                nums[index + 1] = nums[i];
                index++;
            }
        }
        print(nums);
        return nums.length;
    }

    public static void print(int [] arr){
        for (int i= 0 ;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int [] arr = {0,0,1,1,1,2,2,3,3,4};
        int result =  removeDuplicates(arr);

        System.out.println(result);
    }
}
