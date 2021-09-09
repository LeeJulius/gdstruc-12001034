package Julius;

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
}
