package Julius;

import java.util.NoSuchElementException;

public class PlayerLinkedList {
    private PlayerNode head;
    private PlayerNode tail;

    public void addNode(Player player) {
        PlayerNode playerNode = new PlayerNode(player);

        if (head == null) {
            head = playerNode;
            tail = playerNode;

            head.setPreviousPlayer(null);
            tail.setNextPlayer(null);
        }
        else {
            tail.setNextPlayer(playerNode);
            playerNode.setPreviousPlayer(tail);

            tail = playerNode;
            tail.setNextPlayer(null);
        }
    }

    public void printLinkedList() {
        PlayerNode current = head;
        System.out.print("Head -> ");

        while (current != null) {
            System.out.print(current.getPlayer());
            System.out.print(" -> ");
            current = current.getNextPlayer();
        }

        System.out.println("null");
    }

    public void printTailLinkedList() {
        PlayerNode current = tail;
        System.out.print("Null -> ");

        while (current != null) {
            System.out.print(current.getPlayer());
            System.out.print(" -> ");
            current = current.getPreviousPlayer();
        }

        System.out.println("Null");
    }

    public void removeFirstElement() {
        PlayerNode toDelete = head;
        head = head.getNextPlayer();
        toDelete = null;
    }

    public int size() {
        PlayerNode current = head;
        int counter = 0;

        while (current != null) {
            counter++;
            current = current.getNextPlayer();
        }

        return counter;
    }

    public boolean contains(Player search) {
        PlayerNode current = head;

        while (current != null) {
            if (search.equals(current.getPlayer())) return true;
            current = current.getNextPlayer();
        }

        return false;
    }

    public int indexOf(Player search) {
        PlayerNode current = head;
        int index = 0;

        while (current != null) {
            if (search.equals(current.getPlayer())) return index;
            current = current.getNextPlayer();
            index++;
        }

        throw new NoSuchElementException();
    }
}
