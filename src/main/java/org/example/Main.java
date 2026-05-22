package org.example;

import java.util.ArrayList;

public class Main {

    static void main() {

        CardGame game1 = new CardGame();

        game1.shuffleDeck();
        game1.displayDeck();

        for (int i = 0; i < 5; i++) {
            // System.out.println(game1.dealCard());
        }
        Snap snap = new Snap();

        snap.shuffleDeck();
        snap.dealCard();
    }
}
