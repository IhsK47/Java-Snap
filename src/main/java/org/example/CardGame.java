package org.example;

import java.util.ArrayList;
import java.util.Collections;

import static java.util.Objects.compare;

public class CardGame {
    final int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
    static ArrayList<Card> deckOfCards = new ArrayList<>();
    static int head = -1;

    public CardGame() {

        for (Suits s : Suits.values()) {
            for (int val : values) {
                deckOfCards.add(new Card(val, s));
            } //close v
        } // close s
    }

    public static Card dealCard() {
        ++head;
        if (head == deckOfCards.size()) {
            CardGame.shuffleDeck();
            head = 0;
        } //reset deck

        deckOfCards.get(head).info();

        return deckOfCards.get(head);
    }

    public static void SortDeckInNumberOrder() {
        deckOfCards.sort(new SortByValue());
    } //exp:aaaa-2222-3333 etc

    public static void sortDeckIntoSuits() {
        deckOfCards.sort(new SortBySuit());
    } //exp: allSpades, then allHearts etc

    public static void shuffleDeck() {
        System.out.println("Shuffling...");
        Collections.shuffle(deckOfCards);
        CardGame.head = -1;
    }

    public static void displayDeck() {
        for (Card card : deckOfCards) {
            card.info();
        }
    }
}

/*

**ArrayList\<Card\> sortDeckIntoSuits()**

   - Sorts the deck into suits (2,3,4,5,6,7,8,9,10,J,Q,K,A of hearts, then 2,3,4,5,6,7,8,9,10,J,Q,K,A of clubs etc.) and
stores the new shuffled deck back into the deckOfCards attribute.
*/