package com.company;

public class Main {

    public static void main(String[] args) {
        long strat = System.currentTimeMillis();
        StringBuilder str = new StringBuilder();
        for (int i = 0 ; i< 100000; i++)
            str.append('a');
        long end = System.currentTimeMillis();
        System.out.println(str);
        System.out.println((end - strat));
    }
}
