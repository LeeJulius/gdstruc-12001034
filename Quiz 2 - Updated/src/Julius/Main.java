package Julius;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        playerLinkedList.addNode(new Player(1, "Skadoodle", 45));
        playerLinkedList.addNode(new Player (2, "HeathCliff", 23));
        playerLinkedList.addNode(new Player (3, "Asuna", 56));
        playerLinkedList.addNode(new Player (4, "LethalBacon", 69));
        playerLinkedList.addNode(new Player (5, "HPDeskjet", 32));

        playerLinkedList.printLinkedList();
        playerLinkedList.printTailLinkedList();

        System.out.println("Linked List Size: " + playerLinkedList.size());

        System.out.println("\nRemoving First Element:");
        playerLinkedList.removeFirstElement();
        playerLinkedList.printLinkedList();
        System.out.println("Linked List Size: " + playerLinkedList.size());


        System.out.println("\nSearching for LethalBacon:");
        Player findPlayer = new Player (4, "LethalBacon", 69);
        findingPlayer(findPlayer, playerLinkedList);

        System.out.println("\nSearching for Skadoodle:");
        Player findPlayer2 = new Player(1, "Skadoodle", 45);
        findingPlayer(findPlayer2, playerLinkedList);
    }

    static public void findingPlayer(Player findPlayer, PlayerLinkedList playerLinkedList) {
        if (playerLinkedList.contains(findPlayer)) {
            System.out.println("Player is found.");
            System.out.println("Index Size: " + playerLinkedList.indexOf(findPlayer));
        }
        else {
            System.out.println("Player cannot be found.");
        }
    }
}
