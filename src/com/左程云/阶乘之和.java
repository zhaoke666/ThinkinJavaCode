package com.左程云;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

// 1! + 2! +3! + 4! + 5!.....+N!
public class 阶乘之和 {

    public static void main(String[] args) {
        int n = 956;
        long start_time = LocalDateTime.now().toInstant(ZoneOffset.of("+8")).toEpochMilli();
        System.out.println(method1(n));
        long end_time = LocalDateTime.now().toInstant(ZoneOffset.of("+8")).toEpochMilli();
        System.out.println(end_time - start_time);
    }

    public static long method1(int N){
        long ans = 0, cur = 1;
     for (int i = 1; i<=N;i++){
         cur = cur*i;
         ans += cur;
     }
         return ans;
    }


    public static long method2(int N){
        long ans = 0;
        for(int i = 1; i<=N;i++){
            ans += factoria(i);
        }
        return ans;
    }

    private static long factoria(int a) {
        long ans  = 1;
        for (int i=1;i<=a;i++){
            ans*=i;
        }
    return ans;
    }



}
