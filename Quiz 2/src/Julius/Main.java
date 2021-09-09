package Julius;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Player> playerList = new ArrayList<>();

        playerList.add(new Player(1, "Skadoodle", 45));
        playerList.add(new Player (2, "HeathCliff", 23));
        playerList.add(new Player (3, "Asuna", 56));
        playerList.add(new Player (4, "LethalBacon", 69));
        playerList.add(new Player (5, "HPDeskjet", 32));

        System.out.println("Original Array");
        printArray(playerList);

        playerList.remove(0);

        System.out.println("\nRevised Array");
        printArray(playerList);

        System.out.println("\nCheck if array contains Skadoodle");
        System.out.println(playerList.contains(new Player(1, "Skadoodle", 45)));

        System.out.print("\nIndex Number of LethalBacon: ");
        System.out.println(playerList.indexOf(new Player(4, "LethalBacon", 69)));

        linkedList(playerList);
    }

    public static void printArray(List<Player> playerList) {
        System.out.println("Number of Members: " + playerList.size());
        System.out.println("Members: ");
        for (Player p: playerList) System.out.println(p);
    }

    public static void linkedList (List<Player> playerList) {
        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        for (Player p: playerList) {
            playerLinkedList.addNode(p);
        }
        playerLinkedList.printLinkedList();
    }
}
