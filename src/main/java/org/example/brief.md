### To-Do

1. fix enum symbol //tho no need to

## Stage 2

**Card dealCard()**

- Takes the card from the top of the deck and returns it.

---

### Stage 3

Create class for Snap that extends CardGame.

This class should use the methods defined
above, as well as some new ones, to enable the user to play the game snap according to the
following rules:

- By pressing enter in the command line, the user takes their turn.
- Each turn, a new card is dealt from the deck.
- The game continues until two cards in a row have the same symbol/number, at which point the “player” wins and the game
  ends.

### Stage 4

Create a Player class and enable the snap game to be two player, with the users taking it in turns to go. If the snap
occurs on the users turn, they win.

Add a timer so that when there is a snap opportunity, the player has 2 seconds to submit the word “snap” in order to
win. If they don’t type it in time, they lose.

---