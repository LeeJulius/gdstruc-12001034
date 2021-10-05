package Julius;

import java.util.EmptyStackException;

public class discardStack {
    private Card[] discardStack;
    private int top;

    public discardStack(int capacity) {
        discardStack = new Card[capacity];
    }

    public void push(Card card) {
        if (top == discardStack.length) {
            Card[] newCardStack = new Card[2 * discardStack.length];
            System.arraycopy(discardStack, 0, newCardStack, 0, discardStack.length);
            discardStack = newCardStack;
        }

        discardStack[top++] = card;
    }

    public Card pop() {
        if (isEmpty()) throw new EmptyStackException();

        Card poppedCard = discardStack[--top];
        discardStack[top] = null;
        return poppedCard;
    }

    public Card peek() {
        if (isEmpty()) throw new EmptyStackException();

        return discardStack[top - 1];
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public int size() {
        return top;
    }
}
