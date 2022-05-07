package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class 山羊拉丁文 {
    public static final String  SSS = "ma";
    public static String toGoatLatin(String sentence) {
        String [] split = sentence.split("\\s+");
        StringBuilder result = new StringBuilder();
        for(int i = 0;i<split.length;i++){
            String str = split[i];
            if(str.length() == 0){
                continue;
            }
            char c = str.charAt(0);
            System.out.println(c);
            if(judge(c)){
                str += SSS;
            }else{
               str =  str.substring(1,str.length());
               str = str + c + SSS;
            }
            System.out.println(str);
            for (int j = 0; j < i + 1; j++)
                str +='a';
            String  ss = "a";
            String strs = str + ss;

            result.append(str);
            result.append(" ");
        }
        return result.toString().trim();

    }

    public static boolean judge(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

    public static void main(String[] args) {
        System.out.println(toGoatLatin_3("I speak Goat Latin"));
    }


    public static String toGoatLatin_1(String sentence) {
        String[] strs = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        String vowel = "aeiouAEIOU";
        for (int i = 0; i < strs.length; i++) {
            sb.append(vowel.indexOf(strs[i].charAt(0)) == -1 ? strs[i].substring(1) + strs[i].charAt(0) + "ma"
                    : strs[i] + "ma");
            for (int j = 0; j < i + 1; j++)
                sb.append('a');
            sb.append(' ');
        }
        return sb.toString().trim();

    }


    public static String toGoatLatin_3(String sentence) {
        Set<Character> vowels = new HashSet<Character>() {{
            add('a');
            add('e');
            add('i');
            add('o');
            add('u');
            add('A');
            add('E');
            add('I');
            add('O');
            add('U');
        }};

        int n = sentence.length();
        int i = 0, cnt = 1;
        StringBuffer ans = new StringBuffer();

        while (i < n) {
            int j = i;
            while (j < n && sentence.charAt(j) != ' ') {
                ++j;
            }

            ++cnt;
            if (cnt != 2) {
                ans.append(' ');
            }
            if (vowels.contains(sentence.charAt(i))) {
                ans.append(sentence.substring(i, j));
            } else {
                ans.append(sentence.substring(i + 1, j));
                ans.append(sentence.charAt(i));
            }
            ans.append('m');
            for (int k = 0; k < cnt; ++k) {
                ans.append('a');
            }

            i = j + 1;
        }

        return ans.toString();
    }



}
