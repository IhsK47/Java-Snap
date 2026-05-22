package org.example;

import java.util.ArrayList;
import java.util.Collections;

import static java.util.Objects.compare;

public class CardGame {
    int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
    ArrayList<Card> deckOfCards = new ArrayList<>();
    int head = -1;

    public CardGame() {

        //Suits Suits;
        for (Suits s : Suits.values()) {
            for (int val : values) {
                deckOfCards.add(new Card(val, s));
            } //close v
        } // close s
        System.out.println(deckOfCards);

    }

    public Card dealCard() {
        ++head;

        if (head == deckOfCards.size()) {
            this.shuffleDeck();
            head = 0;
        } //reset deck

        System.out.println(deckOfCards.get(head));

        return deckOfCards.get(head);


    }

    public void SortDeckInNumberOrder() {
        deckOfCards.sort(new SortByValue());
    } //exp:aaaa-2222-3333 etc

    public void sortDeckIntoSuits() {
        deckOfCards.sort(new SortBySuit());
    } //exp: sss-hhh-ccc-ddd

    public void shuffleDeck() {
        System.out.println("Shuffling...");
        this.head = -1;
        //worked
    }

    public void displayDeck() {
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