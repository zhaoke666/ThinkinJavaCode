package com.mianshi;


//交换两个变量的值,不是用新的变量
public class Swap {
        // 异或算法可以看成最简单的加密算法
    public static void main(String[] args) {
        int a = 20;
        int b  = 10;
        a = a^b;

        b = a^b;

        a = a^b;

        System.out.println("a------>" + a);
        System.out.println("b------>" + b);
    }

}
