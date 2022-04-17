package com.mianshi;


public class VolatileDemo_2 {

   // public static  volatile  boolean flag = true;

    public static  boolean flag = true;

    public static void main(String[] args) {

        new Thread(()->{
           while (flag){


           }
            System.out.println("======= End of Thread1------------");
        }).start();

        try{
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("turn flag off");
        flag = false;;
    }
}
