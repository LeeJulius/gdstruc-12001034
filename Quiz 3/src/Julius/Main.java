package Julius;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int requiredGame = 10;
        int game = 0;
        int maxRandomPlayers = 7;
        int minimumPlayers = 5;
        Random random = new Random();
        ArrayQuene quene = new ArrayQuene(maxRandomPlayers + minimumPlayers);

        while (game < requiredGame) {
            int rand = random.nextInt(maxRandomPlayers) + 1;
            System.out.println(rand + " players joined the quene.");

            for(int i = 0; i < rand; i++) quene.add(new Player(random.nextInt(60), "Player", random.nextInt(100)));

            System.out.println(quene.size() + " are in quene. These are the players: ");
            quene.printQuene();
            pauseSystem();

            while (quene.size() >= 5 && game != requiredGame) {
                game++;
                System.out.println("People in game " + game + ":");
                for (int i = 0; i < minimumPlayers; i++) System.out.println(quene.remove());
                pauseSystem();
            }
        }
    }

    private static void pauseSystem(){
        System.out.println("Press \"ENTER\" to continue...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
}
