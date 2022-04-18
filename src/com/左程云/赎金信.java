package com.左程云;

import java.util.HashMap;
import java.util.Map;

public class 赎金信 {
    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> charCount = new HashMap<>();
// 初始化 ransomNote 的字符出现次数
        for (char c : ransomNote.toCharArray()) {
            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
        }
// 判断 magazine 中是否有字符可以组成 ransomNote
        for (char c : magazine.toCharArray()) {
            if (charCount.containsKey(c)) {
                if (charCount.get(c) > 1) {
                    charCount.put(c, charCount.get(c) - 1);
                } else {
                    charCount.remove(c);
                }
            }
        }
        if (charCount.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("aa","ab"));
    }
}
