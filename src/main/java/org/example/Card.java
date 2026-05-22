package org.example;

public class Card {
    Suits suit;
    String symbol;
    int value;

    String[] digits = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

    public Card(int value, Suits suit) {
        this.suit = suit;
        this.value = value;

        this.symbol = this.digits[value - 1];
    }

    public void info() {
        System.out.println(this.symbol + " of " + this.suit.utf() + " " + this.suit);
    }

}
