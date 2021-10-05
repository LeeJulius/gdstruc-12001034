package Julius;

import java.util.EmptyStackException;

public class PlayerDeck {
    private Card[] playerDeck;
    private int top;

    public PlayerDeck(int capacity) {
        playerDeck = new Card[capacity];
    }

    public void push(Card card) {
        if (top == playerDeck.length) {
            Card[] newCardStack = new Card[2 * playerDeck.length];
            System.arraycopy(playerDeck, 0, newCardStack, 0, playerDeck.length);
            playerDeck = newCardStack;
        }

        playerDeck[top++] = card;
    }

    public Card pop() {
        if (isEmpty()) throw new EmptyStackException();

        Card poppedCard = playerDeck[--top];
        playerDeck[top] = null;
        return poppedCard;
    }

    public Card peek() {
        if (isEmpty()) throw new EmptyStackException();

        return playerDeck[top - 1];
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public int size() {
        return top;
    }
}
