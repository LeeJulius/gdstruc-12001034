package Julius;

import java.util.EmptyStackException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int startingCapacity = 30;

        discardStack discard = new discardStack(startingCapacity);
        cardHand playerHand = new cardHand();
        PlayerDeck deck = new PlayerDeck(startingCapacity);


        for (int i = 0; i < startingCapacity; i++) {
            deck.push(new Card("Card " + (i + 1)));
        }

        while (!deck.isEmpty()) {
            int command = random.nextInt(3);
            int cardNumber = random.nextInt(5) + 1;

            switch (command) {
                case 0:
                    drawCard(playerHand, deck, cardNumber);
                    break;
                case 1:
                    discardCard(discard, cardNumber, playerHand);
                    break;
                case 2:
                    drawDiscardCard(discard, cardNumber, playerHand);
                    break;
                default:
                    throw new Error();
            }

            pauseSystem();

            playerHand.printStack();
            System.out.println("The deck has " + deck.size() + " cards");
            System.out.println("Discard Pile has " + discard.size() + " cards");
            pauseSystem();
        }
    }

    private static void drawCard(cardHand player, PlayerDeck deck, int cardNumber) {
        System.out.println("Drawing " + cardNumber + " cards");

        if (deck.size() == 0) {
            throw new EmptyStackException();
        }

        if (deck.size() < cardNumber) {
            cardNumber = player.size();
            System.out.println("Insufficient amount. Removing " + cardNumber + " cards from the pile.");
        }

        for (int i = 0; i < cardNumber; i++) {
            player.push(deck.pop());
        }
    }

    private static void discardCard(discardStack discard, int cardNumber, cardHand player) {
        System.out.println("Removing " + cardNumber + " cards");

        if (player.size() == 0) {
            cardNumber = 0;
            System.out.println("Invalid Draw!");
        }

        if (player.size() < cardNumber) {
            cardNumber = player.size();
            System.out.println("Insufficient amount. Removing " + cardNumber + " cards from the pile.");
        }

        for (int i = 0; i < cardNumber; i++) {
            discard.push(player.pop());
        }
    }

    private static void drawDiscardCard(discardStack discard, int cardNumber, cardHand player) {
        System.out.println("Drawing " + cardNumber + " cards from discard pile.");

        if (discard.size() == 0) {
            cardNumber = 0;
            System.out.println("Invalid Draw!");
        }

        if (discard.size() < cardNumber) {
            cardNumber = discard.size();
            System.out.println("Insufficient amount. Drawing " + cardNumber + "cards from the pile.");
        }

        for (int i = 0; i < cardNumber; i++) {
            player.push(discard.pop());
        }
    }

    private static void pauseSystem() {
        System.out.println("Press \"ENTER\" to continue...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
}