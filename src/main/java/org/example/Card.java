package org.example;

public class Card {
    String suit;
    String symbol;
    int value;

    String[] digits = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

    public Card(String suit, int value) {
        this.suit = suit;
        this.value = value;

        this.symbol = this.digits[value - 1];
    }

    public void info() {
        System.out.printf("I am %d of %s with the symb %s ", this.value, this.suit, this.symbol);
    }

}
