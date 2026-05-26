package org.example;

import java.util.Scanner;

public class Snap extends CardGame {
    Boolean snap = false;
    Boolean snap2 = false;
    Player p1 = new Player("ash1");
    Player p2 = new Player("remi2");
    Card previousCard;
    Card currentCard;
    Scanner scanner = new Scanner(System.in);

    public void onePlayer() {
        System.out.println("Snap Game - Press Enter For New Card...\n");
        this.setUp();

        while (!snap) {
            if (this.validEnter()) deal();

            if (previousCard.symbol == currentCard.symbol) {
                snap = true;
                System.out.println("ARSENAL ARSENAL ARSENAL");
            }
        }

    } //close onePlayer()

    public void setUp() {
        CardGame.shuffleDeck();
        currentCard = CardGame.dealCard();
    }

    public Boolean validEnter() {

        System.out.print("press ENTER:");
        String userInput = scanner.nextLine().toLowerCase();
        if (userInput.isBlank() || userInput.equals("enter") || userInput.equals("coyg")) {
            return true;
        } else {
            System.out.println("ONLY the enter key...");
            return false;
        }
    }

    public void deal() {
        previousCard = currentCard;
        currentCard = CardGame.dealCard();
    }

    public void twoPlayer() {
        System.out.println("<Snap Game> \nHOW TO PLAY: \n- Each Player takes a turn\n- When its a match, type 'Snap' to win\n- First to snap wins, good luck!\nPress Enter For New Card...\n");
        setUp();
        while (!snap2) {
            snap2 = playerTurn(p1);
            if (!snap2) snap2 = playerTurn(p2);
        }

    }

    public Boolean playerTurn(Player p) {
        if (this.validEnter()) deal();

        if (previousCard.symbol == currentCard.symbol) {
            System.out.println("You gonna SNAP that bro?");
            //Thread.sleep(2000);
            return snapCheck();
            // String userInput = scanner.nextLine().toLowerCase();

        }
        return false;

        /*
        if previous card = current:
        snapCheck or any input really tbhhhh
        return snap = true
        current player wins
else (potentially speaking)
        player x did not snap, player y, will you?
        */

    }

    public Boolean snapCheck() {
        return true;
    }

}


/*




twoPlayer{


 */