import java.util.Scanner;

public class RankMatch {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int numOfPlayers = 0;

        System.out.println();
        System.out.println("****************************");
        System.out.println("*** Welcome to RankMatch ***");
        System.out.println("****************************");
        System.out.println();

        System.out.print("How many players? (1-4): ");
        numOfPlayers = keyboard.nextInt();

        if (numOfPlayers < 1 || numOfPlayers > 4) {
            System.out.println("Invalid number of players. Please enter a number between 1 and 4.");
        }

        String[] playerNames = new String[numOfPlayers];

        for (int i = 1; i <= numOfPlayers; i++) {
            System.out.print("Enter the name for Player " + i + ": ");
            playerNames[i - 1] = keyboard.next();
        }

        System.out.println();
        for (int i = 1; i <= numOfPlayers; i++) {
            System.out.print(playerNames[i - 1] + ", choose a target rank (2, 3, 4, 5, 6, 7, 8, 9 , 10, Jack, Queen, King, Ace): ");
            String targetRank = keyboard.next();

            System.out.print("How many rank matches are required? (2-4): ");
            int requiredMatches = keyboard.nextInt();

            System.out.print("How many cards do you think will be dealt before " + requiredMatches + " of rank " + targetRank + " are found? ");
            int guessNumber = keyboard.nextInt();

        }

    }
}