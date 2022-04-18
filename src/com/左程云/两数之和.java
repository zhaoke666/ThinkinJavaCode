package com.左程云;

import java.util.HashMap;

public class 两数之和 {

    public int[] twoSum(int[] nums, int target) {
        int [] arr = new int[2];
        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            if(hash.containsKey(nums[i])){
                arr[0] = i;
                arr[1] = hash.get(nums[i]);
                return arr;
            }
            // 将数据存入 key为补数 ，value为下标
            hash.put(target-nums[i],i);
        }
        return arr;
    }
}
