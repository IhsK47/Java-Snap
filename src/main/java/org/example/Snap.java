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
        //String userInput = scanner.nextLine().toLowerCase();
        String userInput = scanner.nextLine().replace("\r", "").trim().toLowerCase();


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
        System.out.println("<Snap Game> \nHOW TO PLAY: \n- Each Player takes a turn\n- When its a match, you have 2 seconds to type 'Snap'\n- First to snap wins, good luck!\nPress Enter For New Card...\n");
        setUp();
        while (!snap2) {
            snap2 = playerTurn(p1);
            if (!snap2) snap2 = playerTurn(p2);
        }
    }

    public Boolean playerTurn(Player p) {

        System.out.printf("%s,", p.name);
        if (validEnter()) { //prompt until valid input
            deal();

            if (previousCard.symbol == currentCard.symbol) {
                System.out.println("You gonna SNAP that bro?");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                String userInput = scanner.nextLine().toLowerCase();

                if (userInput.contains("snap")) {
                    System.out.println(p.name + " takes the trophy!");
                    return true;
                } else {
                    System.out.println("You failed to snap, game continues");
                }
            }
        }

        return false;

        /*
        if p x no snap?
else (potentially speaking)
        player x did not snap, player y, will you?
        */

    }

    public Boolean snapCheck() {
        //currently unused, but if snap is allowed to be passed on, can be used
        return true;
    }

}


/*

 */