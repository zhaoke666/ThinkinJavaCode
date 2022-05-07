package com.leetcode;


/**
 * 汉明重量是一串符号中非零符号的个数。因此它等同于同样长度的全零符号串的汉明距离。在最为常见的数据位符号串中，它是1的个数。
 *
 * 汉明距离：它表示两个（相同长度）字符串对应位置的不同字符的数量
 */
public class 汉明重量 {


    public static int hammingWeight_1(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n = n >>> 1;
        }
        return count;
    }
    public static int hammingWeight_2(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if (((n >>> i) & 1) == 1) {
                count++;
            }
        }
        return count;
    }

    public static int hammingWeight_3(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n = n >>> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 00000000000000000000000000001011;
        System.out.println(hammingWeight_3(n));
    }
}
