package com.mianshi;



/**
 * volatile和Synchronized有什么区别？
 *  Synchronized 关键字，用来加锁，Volatile知识保持变量的线程可见性，通常适合用于一个线程写，多个线程读的场景。
 *
 *  Volatile 能不能保证线程安全？
 *  Volatile不能保证线程安全，只能保证线程的可见性，不能保证线程的原子性
 *
 * DCL 单例为什么要加Volatile关键字？
 *
 */
public class VolatileDemo_1 {

    /*private static VolatileDemo_1 single = new VolatileDemo_1();

        private   VolatileDemo_1(){};

    public static  VolatileDemo_1 getInstance(){
        return single;
    }
    */
    private static VolatileDemo_1 single;

    private   VolatileDemo_1(){};

    public static  VolatileDemo_1 getInstance() {
        if(null == single){
            synchronized (VolatileDemo_1.class){
                if(null == single){
                    single = new VolatileDemo_1();
                }
            }
        }
        return single;
    }



    }
