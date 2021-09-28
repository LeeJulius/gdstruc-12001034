package Julius;

import java.util.EmptyStackException;

public class discardStack {
    private Card[] cardStack;
    private int top;

    public discardStack(int capacity) {
        cardStack = new Card[capacity];
    }

    public void push(Card card) {
        if (top == cardStack.length) {
            Card[] newCardStack = new Card[2 * cardStack.length];
            System.arraycopy(cardStack, 0, newCardStack, 0, cardStack.length);
            cardStack = newCardStack;
        }

        cardStack[top++] = card;
    }

    public Card pop() {
        if (isEmpty()) throw new EmptyStackException();

        Card poppedCard = cardStack[--top];
        cardStack[top] = null;
        return poppedCard;
    }

    public Card peek() {
        if (isEmpty()) throw new EmptyStackException();

        return cardStack[top - 1];
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public int size() {
        return top;
    }
}
