package com.leetcode;

public class 位运算 {

    public static void print(int num){
        for (int i= 31; i>=0; i--){
            System.out.print((num & (1<<i)) == 0? "0":"1");
        }
        System.out.println();
    }



    public static void main(String [] args){
        /*print(4);

        System.out.println("--------------------------最大整数-----------------------------");
        int a = Integer.MAX_VALUE;
        System.out.println(a);//2147483647   2^31 - 1
        print(a);

        System.out.println("--------------------------最小整数-----------------------------");
        int min = Integer.MIN_VALUE; //-2147483648   -2^31
        System.out.println(min);
        print(min);

        int m = 34242424;
        System.out.println("--------------------------取反-----------------------------");
        int n = ~m;
        print(m);
        print(n);

        int n1 = -m;
        System.out.println(n1);
        System.out.println(~m+1);


        System.out.println("--------------------------右移-----------------------------");
        print(m);
        print(m>>1);
        print(m>>>1);
        System.out.println("最小整数");
        print(min);
        print(min>>>1); //01000000000000000000000000000000
        print(min>>1);  //11000000000000000000000000000000

        System.out.println("--------------------------左移-----------------------------");

        print(m);
        print(m<<1);
        //print(m<<<1);
        System.out.println("最小整数");
        print(min);
        //print(min<<1); //01000000000000000000000000000000
        print(min<<1);  //11000000000000000000000000000000
        */
        int a = 100;
        System.out.println(a>>>3);


    }



}
