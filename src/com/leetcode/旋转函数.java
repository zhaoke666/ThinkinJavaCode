package com.leetcode;

public class 旋转函数 {





    /**
     *错位相减法
     *	F(k) = 0*Bk[0] + 1*Bk[1] +...+ (n-2)*Bk[n-2] + (n-1)*Bk[n-1]
     *	F(k+1) = 0*Bk[n-1] + 1*Bk[0] +...+ (n-1)*Bk[n-2]
     *	F(k+1) = 1*Bk[0] + 2*Bk[1] +...+ (n-1)*Bk[n-2] + 0*Bk[n-1]
     *	F(k+1) - F(k) = Bk[0] + +...+ Bk[n-2] - (n-1)*Bk[n-1]
     *	F(k+1) - F(k) = Bk[0] +...+ Bk[n-1] -n*Bk[n-1]
     *	F(k+1) = F(k) + sum(A) -n*Bk[n-1]
     */
    public static int maxRotateFunction(int[] nums) {
        int Fk = 0;
        int max = 0;
        int sum = 0;
        //计算 F(0)和 sum(A)
        for(int i = 0; i < nums.length; i++) {
            Fk += i * nums[i];
            sum += nums[i];
        }
        max = Fk;
        for(int i = 0; i < nums.length; i++) {
            //F(k+1) = F(k) + sum(A) -n*Bk[n-1]
            Fk = Fk + sum - nums.length * nums[nums.length-i-1];
            //比较 Fk求最大值
            if(Fk > max)
                max = Fk;
        }
        return max;
    }

    public static int maxRotateFunction_1(int[] nums) {
        int aSize = nums.length;
        if (aSize < 2){
            return 0;
        }
        //result用于储存中间最大结果，tempRes用于储存动态移动结果, sum用于求A原始数组的和
        int result = 0;
        int tempRes = 0, sum = 0;
        //便利数组求和，和F（0）
        for (int index = 0; index < aSize; ++index){
            sum += nums[index];
            tempRes += index * nums[index];
        }
        result = tempRes;//初始结果
        //当穷举每一个元素作为最后一个时，进行移动后的结果
        for (int index = aSize - 1; index >= 0; --index){
            tempRes += (sum - (long)aSize * nums[index]);
            result = Math.max(result, tempRes);//更新结果
        }
        return result;

    }

    public static void main(String[] args) {
        int [] arr = {4,3,2,6};
        System.out.println(maxRotateFunction_1(arr));

    }
}
