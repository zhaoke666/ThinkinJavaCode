package com.leetcode;

public class 回文数 {

    public static boolean isPalindrome(int x) {
        if(x<=10){
            return false;
        }
        String str = String.valueOf(x);// 转化为字符串
         //偶数
            int count = str.length()/2;
            String ss ="";
            if(str.length()%2==0){
                ss = str.substring(count,str.length());
            }else{
                ss = str.substring(count+1,str.length());
            }

            System.out.println(ss);
            String valuie = str.substring(0,count);

            StringBuffer sb = new StringBuffer(valuie);
            StringBuffer str13 = sb.reverse();
            System.out.println(str13.toString());
            if(str13.toString().equals(ss))
                return true;
            else
                return false;

    }

    public static void main(String[] args) {

        System.out.println(isPalindrome(121));
    }
}
