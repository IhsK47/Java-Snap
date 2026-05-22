package org.example;

import java.util.Comparator;

public class SortBySuit implements Comparator<Card> {

    @Override
    public int compare(Card o1, Card o2) {
        return o1.suit.compareTo(o2.suit);
    }
}
