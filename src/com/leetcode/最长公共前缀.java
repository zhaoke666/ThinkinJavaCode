package com.leetcode;

public class 最长公共前缀 {

    //错误
    public static String longestCommonPrefix(String[] strs) {
        String result = "";
        if(strs.length == 0) return "";
        if(strs.length == 1) {
            return strs[0];
        }
        //获取最小字符串长度
        int len = 0;
        for(String str:strs){
            if(len == 0 ||len>str.length() ) {
                len = str.length();
            }
        }
        // -个字符串一个字符串的比较
        Boolean flag = false;
      for(int i = 0;i<len;i++){
            if(strs[i].length()==0) return "";
            String ss = strs[i].substring(0,i+1);
            for (String str: strs){
                if(!str.startsWith(ss)) {
                    flag = true;
                    continue;
                }
                if(len == 0||len>str.length()){
                    len = str.length();
                }
            }
            if(flag)
                break;
            else
                result = ss;

        }
        return result;
    }

    public static void main(String[] args) {
        String[] strs = {"flower","flower","flower","flower"};
        System.out.println(longestCommonPrefix(strs));
    }

}
