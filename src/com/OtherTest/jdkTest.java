package com.OtherTest;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

public class jdkTest  {

    /**
     * LocalDate是一个不可变的类，它表示默认格式(yyyy-MM-dd)的日期，
     * @param args
     */
    public static void main(String[] args) {
        jdkTest java8tester = new jdkTest();
        java8tester.testLocalDateTime();
    }
    //local
    public void testLocalDateTime(){
        // 当前日期yyyy-MM-dd
        LocalDate localDate1 = LocalDate.now();
        System.out.println("当前日期："+localDate1);
        // 创建一个日期
        LocalDate localDate2 = LocalDate.of(2017, 10, 17);
        System.out.println("创建一个指定日期："+localDate2);
        // 获取指定时区的当前时间
        LocalDate localDate3 = LocalDate.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("获取指定时区的当前时间:"+localDate3);
        // 格林威治时间+天数
        //默认获取的是以UTC时区，世界协调时间，为基础
        LocalDate localDate4 = LocalDate.ofEpochDay(365);
        System.out.println(localDate4);
        // 某年的第几天的日期
        LocalDate localDate5 = LocalDate.ofYearDay(2017, 200);
        System.out.println(localDate5);

    }

    ThreadLocal s = new ThreadLocal();




}
