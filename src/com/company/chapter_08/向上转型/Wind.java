package com.company.chapter_08.向上转型;

public class Wind extends  Instrument {

    @Override
    public void play(Note n) {
       System.out.println("wind.play()" + n);
    }

}
