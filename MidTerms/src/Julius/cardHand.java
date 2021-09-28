package Julius;

import java.util.LinkedList;
import java.util.ListIterator;

public class cardHand {
    private LinkedList<Card> discardStack;

    public cardHand() {
        discardStack = new LinkedList<Card>();
    }

    public void push(Card card) {
        discardStack.push(card);
    }

    public Card pop() {
        return discardStack.pop();
    }

    public Card peek() {
        return discardStack.peek();
    }

    public int size() {
        int size = 0;

        ListIterator<Card> iterator = discardStack.listIterator();
        while(iterator.hasNext()) {
            size++;
            iterator.next();
        }
        return size;
    }

    public void printStack() {
        System.out.println("Card Stack: ");
        ListIterator<Card> iterator = discardStack.listIterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public boolean isEmpty() {

        int size = 0;

        ListIterator<Card> iterator = discardStack.listIterator();
        while(iterator.hasNext()) {
            size++;
            iterator.next();
        }

        return size == 0;
    }
}
