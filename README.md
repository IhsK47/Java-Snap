# Java-Snap

---

## Overview

This game models a card game using the Java language.

---

## Game contains:

### Card

- A suit: Utilising the UTF-8 of heart, club, diamond and spade.
- A symbol (A-K)
- An int value (1,13)

- info() Method

---

### CardGame contains deckOfCards

- Has a displayDeck method that lists out the cards in the deck.

**Card dealCard()**

Takes the card from the top of the deck and returns it.

**ArrayList\<Card\> sortDeckInNumberOrder()**

Sorts the deck in number order (e.g. 2222333344445555 etc) and stores the new shuffled deck back into the deckOfCards
attribute.

**ArrayList\<Card\> sortDeckIntoSuits()**

Sorts the deck into suits (2,3,4,5,6,7,8,9,10,J,Q,K,A of hearts, then 2,3,4,5,6,7,8,9,10,J,Q,K,A of clubs etc.) and
stores the new shuffled deck back into the deckOfCards attribute.

**ArrayList\<Card\> shuffleDeck()**

Shuffles the deck into a random order and stores the new shuffled deck back into the deckOfCards attribute.

---

### OnePlayer (inside Snap)

Design: Snap extends CardGame.

HOW TO PLAY:

- Pressing enter in the command line to take a turn.
- Each turn, a new card is dealt from the deck.
- The player keeps taking turns until they get same symbol twice in a row, in order to win the game.

### twoPlayer

Using a player class, two players now take turns to go.
If the snap occurs on the users turn, they win.

Add a timer so that when there is a snap opportunity, the player has 2 seconds to submit the word “snap” in order to
win. If they don’t type it in time, they lose.

HOW TO PLAY:

- Each Player takes a turn
- When its a match, you have 2 seconds to type 'Snap'
- First to snap wins, good luck!

---