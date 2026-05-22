### To-Do

1. fix enum symbol //tho no need to
2. how to do scanners
3. timers

## Stage 2

**Card dealCard()**

- Takes the card from the top of the deck and returns it.

---

### Stage 3

Create class for Snap that extends CardGame.

This class should use the methods defined
above, as well as some new ones, to enable the user to play the game snap according to the
following rules:

- Scanner = Pressing enter in the command line, user takes their turn.
- Each turn, dealCard.
- The game continues until two cards in a row have the same symbol/number,
- at which point the “player” wins and the game
  ends.

### Stage 4

Create Player class and enable snap game to be two-player

- users taking turns
- If snap occurs on users turn, they win or game continues

Add a timer so when there is a snap opportunity, player has 2sec to submit the word “snap” in order to
win.
If they don’t type it in time, they lose.

---