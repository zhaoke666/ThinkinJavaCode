package com.company.chapter_08.向上转型;

public class Music {

    public static void  tune(Instrument instrument){
        instrument.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute);

    }
}
