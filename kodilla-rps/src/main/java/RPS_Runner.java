import java.util.Random;
import java.util.Scanner;

public class RPS_Runner {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int userChoice;
        int computerChoice;
        String playerName;

        System.out.println("Welcome to Rock,Paper,Scissors game!");
        System.out.println("Please enter your name:");
        playerName = scanner.nextLine();
        System.out.println("Enter your move (1 = Rock, 2 = Paper, 3 = Scissors):");
        userChoice = scanner.nextInt();

        if (userChoice < 1 || userChoice > 3) {
            System.out.println("Invalid move! End of program.");
            System.exit(0);
        }
        computerChoice = random.nextInt(3)+1;

        if (userChoice == computerChoice){
            if (userChoice == 1) {
                System.out.println("Tie! Both players choose Rock!");
            }else if (userChoice == 2){
                System.out.println("Tie! Both players choose Paper!");
            }else {
                System.out.println("Tie! Both players choose Scissors!");
            }
        }
        if (userChoice == 1) {
            if (computerChoice == 2) {
                System.out.println(playerName + " choose Rock; Computer choose Paper.");
                System.out.println("Computer wins!");
            }else {
                System.out.println(playerName + " choose Rock; Computer choose Scissors.");
                System.out.println(playerName + " wins!");
            }
        }else if (userChoice == 2) {
            if (computerChoice == 1) {
                System.out.println(playerName + " choose Paper; Computer choose Rock.");
                System.out.println(playerName + " wins!");
            }else {
                System.out.println(playerName + " choose Paper; Computer choose Scissors.");
                System.out.println("Computer wins!");
            }
        }else {
            if (computerChoice == 1) {
                System.out.println(playerName + " choose Scissors; Computer choose Rock.");
                System.out.println("Computer wins!");
            }else {
                System.out.println(playerName + " choose Scissors; Computer choose Paper.");
                System.out.println(playerName + " wins!");
            }
        }
    }
}
