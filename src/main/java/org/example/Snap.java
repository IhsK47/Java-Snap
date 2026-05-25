package org.example;

import java.io.Reader;
import java.util.Scanner;

public class Snap extends CardGame {
    Boolean snap = false;
    Boolean snap2 = false;
    Player p1 = new Player("ash1");
    Player p2 = new Player("remi2");
    Card previousCard;
    Card currentCard;

    public void run() {
        this.setUp();
        System.out.println("Snap Game - Press Enter For New Card...\n");


        while (!snap) {
            if (this.validEnter()) turn();

            if (previousCard.symbol == currentCard.symbol) {
                snap = true;
                System.out.println("ARSENAL ARSENAL ARSENAL");
            }
        }

    } //close run()

    public void setUp() {
        CardGame.shuffleDeck();
        currentCard = CardGame.dealCard();
    }

    public Boolean validEnter() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("press ENTER:");
        String userInput = scanner.nextLine().toLowerCase();
        if (userInput.isBlank() || userInput.equals("enter") || userInput.equals("coyg")) {
            return true;
        } else {
            System.out.println("ONLY the enter key...");
            return false;
        }
    }

    public void turn() {
        previousCard = currentCard;
        currentCard = CardGame.dealCard();
    }

    public void twoPlayer() {
        setUp();
        System.out.println("<Snap Game> \nHOW TO PLAY: \n- Each Player takes a turn\n- When its a match, type 'Snap' to win\n- First to snap wins, good luck!\nPress Enter For New Card...\n");
        while (!snap2) {
            validEnter();
            System.out.println("loop ran once");
            snap2 = true;
        }

    }

    public void playerTurn() {
    }
}


/*



while !snap
player 1. turn
player 2. turn

while run:
p1 turn check()
if run still p2 turn check()

playerTurn()
turn i.e. store previous and deal current
allow input
sleep
if previous card = current:
    check for snap or any input really tbhhhh
        return snap = true
        current player wins
else (potentially speaking)
    player x did not snap, player y, will you?





twoPlayer{
 while not snap:
    snap = playerturn (1)
    if not snap:
    playerturn (2)
}




 */