package org.example;

public enum Suits {

    Spades("\u2660"),
    Hearts("\u2665"),
    Clubs("\u2663"),
    Diamonds("\u2666");


    private String utf;

    Suits(String utf) {
        this.utf = utf;
    }

    public String utf() {
        return utf;
    }
}