package Julius;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("The Dropper Algorithm:");

        int initialTime = -1;

        while (initialTime < 0) {
            System.out.println("Input Initial Time (in seconds): ");
            initialTime = scanner.nextInt();
            if (initialTime < 0) System.out.println("Invalid Time");
        }

        int finalTime = initialTime;

        while (finalTime <= initialTime) {
            System.out.println("Input Final Time (in seconds): ");
            finalTime = scanner.nextInt();
            if (finalTime <= initialTime) System.out.println("Invalid Time ");
        }


        System.out.println("Input Distance you think it will travel (in meters): ");
        int distance = scanner.nextInt();

        double theoreticalDistance = (4.8 * (finalTime * finalTime)) - (4.8 * (initialTime * initialTime));

        if (theoreticalDistance >= distance) {
            System.out.println("It will make it");
            System.out.println("It travelled " + theoreticalDistance + " m");
        }
        else {
            System.out.println("It did not make it");
            System.out.println("It only travelled " + theoreticalDistance + " m");
        }
    }
}
