import java.util.Random;
import java.util.Scanner;

public class RPS_Runner {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int userChoice;
        int computerChoice;
        String playerName;
        int numerOfRounds;
        boolean end = false;
        String input;

        System.out.println("Welcome to Rock,Paper,Scissors game!");
        System.out.println("Please enter your name:");
        playerName = scanner.nextLine();
        while (!end) {
            System.out.println("How many round you want to play? Enter value from 1 to 10: ");
            numerOfRounds = scanner.nextInt();
            if (numerOfRounds <= 0 || numerOfRounds > 10) {
                System.out.println("Choose number of rounds from given range!");
            }
            while (numerOfRounds > 0 && numerOfRounds < 11) {
                System.out.println("Enter your move (1 = Rock, 2 = Paper, 3 = Scissors):");
                userChoice = scanner.nextInt();

                if (userChoice < 1 || userChoice > 3) {
                    System.out.println("Invalid move! End of program.");
                    System.exit(0);
                }
                computerChoice = random.nextInt(3) + 1;


                if (userChoice == computerChoice) {
                    if (userChoice == 1) {
                        System.out.println("Tie! Both players choose Rock!");
                    } else if (userChoice == 2) {
                        System.out.println("Tie! Both players choose Paper!");
                    } else {
                        System.out.println("Tie! Both players choose Scissors!");
                    }
                } else if (userChoice == 1) {
                    if (computerChoice == 2) {
                        System.out.println(playerName + " choose Rock; Computer choose Paper.");
                        System.out.println("Computer wins!");
                    } else {
                        System.out.println(playerName + " choose Rock; Computer choose Scissors.");
                        System.out.println(playerName + " wins!");
                    }
                } else if (userChoice == 2) {
                    if (computerChoice == 1) {
                        System.out.println(playerName + " choose Paper; Computer choose Rock.");
                        System.out.println(playerName + " wins!");
                    } else {
                        System.out.println(playerName + " choose Paper; Computer choose Scissors.");
                        System.out.println("Computer wins!");
                    }
                } else {
                    if (computerChoice == 1) {
                        System.out.println(playerName + " choose Scissors; Computer choose Rock.");
                        System.out.println("Computer wins!");
                    } else {
                        System.out.println(playerName + " choose Scissors; Computer choose Paper.");
                        System.out.println(playerName + " wins!");
                    }
                }
                numerOfRounds--;
            }
            System.out.println("What's next, finish? Press x");
            System.out.println("New game? Press n");
            input = scanner.nextLine();
            if (input.equals("n")) {
                end = false;
            } else if (input.equals("x")) {
                end = true;
                System.exit(0);
            } else {
                System.out.println("Input correct value!");
            }
        }
    }
}
