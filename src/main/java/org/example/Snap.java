package org.example;

public class Snap extends CardGame {
    Boolean win = false;
    Player p1 = new Player("ash1");
    Player p2 = new Player("remi2");

    public void run() {
        System.out.println("i am  snap");


        this.turn();

    }

    public void turn() {
        CardGame.dealCard();
    }
}


/*

This class should use the methods defined above,
as well as some new ones,
enable the user to play the game snap according to the following rules:

- By pressing enter in the command line, the user takes their turn.
- Each turn, a new card is dealt from the deck.
- The game continues until two cards in a row have the same symbol/number, at which point the “player” wins and the game
ends.


while snap = false
player 1. turn
player 2. turn


turn()
if previous card = current anddd snap within two seconds:
snap = true
current player wins


 */