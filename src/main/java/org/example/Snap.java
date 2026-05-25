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
        this.setUp();
        System.out.println("Snap Game - Press Enter For New Card...\n");


        Scanner scanner = new Scanner(System.in);

        while (win == false) {
            System.out.print("Press ENTER:");
            String userInput = scanner.nextLine();

            if (userInput.isBlank()) {
                return true;
            } else {
                System.out.println("ONLY the enter key...");
            }

            if validEnter() turn();

            if (previousCard.symbol == currentCard.symbol) {
                win = true;
                System.out.println("ARSENAL ARSENAL ARSENAL");
            }
        }

    } //close run()

    public void twoPlayer() {
        setUp();
        System.out.println("<Snap Game> \nHOW TO PLAY: \n- Each Player takes a turn\n- When its a match, type 'Snap' to win\n- First to snap wins, good luck!\nPress Enter For New Card...\n");


    }

    public void setUp() {
        CardGame.shuffleDeck();
        currentCard = CardGame.dealCard();
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