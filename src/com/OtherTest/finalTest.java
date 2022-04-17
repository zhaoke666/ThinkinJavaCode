package com.OtherTest;


import java.util.*;

public class finalTest {

        final   int  a=6;//final成员变量不能被更改
        final   int  b;//在声明final成员变量时没有赋值，称为空白final

        public finalTest(){
            b=8;//在构造方法中为空白final赋值
        }

        void  doit(){
            final int i = 7;//局部变量定义为final，不可改变i的值
        }

        List<String> lsit = new ArrayList<>();

        List<String> list = new ArrayList<>();
        List<String>  list_1 = new LinkedList<>();

        Set<String> set = new HashSet<>();

        


}
