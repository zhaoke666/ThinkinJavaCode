package com.company.chapter_02;

public  class StaticTest {

    static int i = 47;

    static int b ;

}


class Test{

    public static void main(String[] args) {
        StaticTest t1 = new StaticTest();
        StaticTest t2 = new StaticTest();

        System.out.println(t1.i);
        System.out.println(t2.i);
        t1.i++;
        System.out.println(t1.i);
        System.out.println(t2.i);


    }
}