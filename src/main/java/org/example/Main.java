package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    static void main() {

        ArrayList deckOfCards = new ArrayList<>();
        String[] suits = {"\u2660 Spades", "\u2665 Hearts", "\u2663 Clubs", "\u2666 Diamonds"}; //♠, ♥, ♣, ♦

        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};


        // card suit val //ij loop

        Card js = new Card("Spades", 11);

        System.out.println(Arrays.toString(suits));

        //System.out.println(Arrays.toString(qs));

        js.info();

        int i = 0;
        int j = 0;

//        for (i in suits) {
//        }

    }
}
