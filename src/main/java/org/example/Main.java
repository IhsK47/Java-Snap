package org.example;

import java.util.ArrayList;

public class Main {

    static void main() {

        // String[] suits = {"\u2660 Spades", "\u2665 Hearts", "\u2663 Clubs", "\u2666 Diamonds"}; //♠, ♥, ♣, ♦
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};


        CardGame game1 = new CardGame();

        game1.shuffleDeck();
        game1.SortDeckInNumberOrder();
    }
}
