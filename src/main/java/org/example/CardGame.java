package org.example;

import java.util.ArrayList;
import java.util.Collections;

import static java.util.Objects.compare;

public class CardGame {
    int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
    ArrayList<Card> deckOfCards = new ArrayList<>();
    int head = 0;

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

        System.out.println(deckOfCards.get(head));

        return deckOfCards.get(head);

    }

    public void SortDeckInNumberOrder() {
        //exp: aaaa-2222-3333

        deckOfCards.sort(new SortByValue()); //probs not working LOGICALLY

        for (Card card : deckOfCards) {
            card.info();
        }
    } //close number order

    public void sortDeckIntoSuits() {
        //exp: A234567-K Spades then a-K hearts etc

    }

    public void shuffleDeck() {
        System.out.println("Shuffling...");
        Collections.shuffle(deckOfCards); //worked
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