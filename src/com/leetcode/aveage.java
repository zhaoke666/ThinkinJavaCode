package com.leetcode;


/**
 * 给你一个整数数组 salary ，数组里每个数都是 唯一 的，其中 salary[i] 是第 i 个员工的工资。
 *
 * 请你返回去掉最低工资和最高工资以后，剩下员工工资的平均值。
 *
 */
public class aveage {
    public static double average(int[] salary) {
        int sum = 0;
        int maxValue  = 0, minValue = 0;
        for (int i = 0; i<salary.length;i++){
            sum += salary[i];
            if( i == 0){
                maxValue = salary[i];
                minValue = salary[i];
            }else{
                maxValue = maxValue>salary[i]?maxValue:salary[i];
                minValue = minValue<salary[i]?minValue:salary[i];
            }
        }
        System.out.println("整个数组的和：" + sum);
        System.out.println("数组中最大值和最小值分别是："+maxValue +"和" + minValue);
        double  result = Double.valueOf(sum - maxValue - minValue);
       return result /(salary.length-2);

    }

    public static void main(String[] args) {
        int [] salary = {48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,77000,33000,28000,4000,54000,67000,6000,1000,11000};
        System.out.println(average(salary));
    }
}
