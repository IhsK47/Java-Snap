package org.example;

import java.util.Comparator;

//import java.util.function.Function;

public class SortByValue implements Comparator<Card> {
    @Override
    public int compare(Card o1, Card o2) {
        System.out.println(Math.min(o1.value, o2.value));
        return Integer.compare(o1.value, o2.value);
    }

}
