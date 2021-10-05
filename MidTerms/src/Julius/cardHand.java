package Julius;

import java.util.LinkedList;
import java.util.ListIterator;

public class cardHand {
    private LinkedList<Card> playerHand;

    public cardHand() {
        playerHand = new LinkedList<Card>();
    }

    public void push(Card card) {
        playerHand.push(card);
    }

    public Card pop() {
        return playerHand.pop();
    }

    public Card peek() {
        return playerHand.peek();
    }

    public int size() {
        int size = 0;

        ListIterator<Card> iterator = playerHand.listIterator();
        while(iterator.hasNext()) {
            size++;
            iterator.next();
        }
        return size;
    }

    public void printStack() {
        System.out.println("Card Stack: ");
        ListIterator<Card> iterator = playerHand.listIterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public boolean isEmpty() {

        int size = 0;

        ListIterator<Card> iterator = playerHand.listIterator();
        while(iterator.hasNext()) {
            size++;
            iterator.next();
        }

        return size == 0;
    }
}
