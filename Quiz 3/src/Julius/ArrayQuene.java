package Julius;

import java.util.NoSuchElementException;

public class ArrayQuene {
    private Player[] quene;
    private int front;
    private int back;

    public ArrayQuene(int capacity){
        quene = new Player[capacity];
    }

    public void add(Player player) {
        if (back == quene.length) {
            Player[] newArray = new Player[quene.length * 2];
            System.arraycopy(quene, 0, newArray, 0, quene.length);
            quene = newArray;
        }

        quene[back] = player;
        back++;

    }

    public Player remove() {
        if (size() == 0) throw new NoSuchElementException();

        Player removedPlayer = quene[front];
        quene[front] = null;
        front++;

        if (size() == 0) {
            front = 0;
            back = 0;
        }

        return removedPlayer;
    }

    public Player peek() {
        if (size() == 0) throw new NoSuchElementException();

        return quene[front];
    }

    public void printQuene() {
        for(int i = front; i < back; i++) {
            System.out.println(quene[i]);
        }
    }
    public int size() {
        return back - front;
    }
}
