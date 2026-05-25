package org.example;

import java.io.Reader;
import java.util.Scanner;

public class Snap extends CardGame {
    Boolean win = false;
    Boolean win2 = false;
    Player p1 = new Player("ash1");
    Player p2 = new Player("remi2");
    Card previousCard;
    Card currentCard;

    public void run() {
        CardGame.shuffleDeck();
        System.out.println("Snap Game - Press Enter For New Card...\n");
        currentCard = CardGame.dealCard();

        Scanner scanner = new Scanner(System.in);

        while (win == false) {
            System.out.print("Press ENTER:");
            String userInput = scanner.nextLine();

            if (userInput.isBlank()) {
                this.turn();
            } else {
                System.out.println("ONLY the enter key...");
            }

            if (previousCard.symbol == currentCard.symbol) {
                win = true;
                System.out.println("ARSENAL ARSENAL ARSENAL");
            }
        }

    } //close run()

    public void twoPlayer() {
        //
    }

    public void turn() {
        previousCard = currentCard;
        currentCard = CardGame.dealCard();
    }
}


/*

- enter in the command line, the user takes their turn.
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