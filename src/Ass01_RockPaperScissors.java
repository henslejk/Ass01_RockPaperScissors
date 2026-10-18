import java.util.Scanner;

public class Ass01_RockPaperScissors {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String playerA = "";
        String playerB = "";
        String playAgain = "Y";
        boolean done = false;


        while (playAgain.equalsIgnoreCase("Y")) {
            // Player A Input
            do {
                IO.println("Player A enter your Rock Paper Scissors [R, P, S] move:");
                playerA = in.nextLine().toUpperCase();

                if (playerA.equals("R") || playerA.equals("P") || playerA.equals("S")) {
                    done = true;
                } else {
                    IO.println("Invalid move. Please enter R, P, or S.");
                }

            } while (!done);

            // Reset for Player B
            done = false;

            // Player B Input
            do {
                IO.println("Player B enter your Rock Paper Scissors [R, P, S] move:");
                playerB = in.nextLine().toUpperCase();

                if (playerB.equals("R") || playerB.equals("P") || playerB.equals("S")) {
                    done = true;
                } else {
                    IO.println("Invalid move. Please enter R, P, or S.");
                }

            } while (!done);

            // Determine Winner
            if (playerA.equals(playerB)) {
                IO.println("It's a tie.");
            } else if (playerA.equals("R") && playerB.equals("S")) {
                IO.println("Rock breaks Scissors. Player A WINS.");
            } else if (playerA.equals("R") && playerB.equals("P")) {
                IO.println("Paper covers Rock. Player B WINS.");
            } else if (playerA.equals("P") && playerB.equals("R")) {
                IO.println("Paper covers Rock. Player A WINS.");
            } else if (playerA.equals("P") && playerB.equals("S")) {
                IO.println("Scissors cuts Paper. Player B WINS.");
            } else if (playerA.equals("S") && playerB.equals("P")) {
                IO.println("Scissors cuts Paper. Player A WINS.");
            } else if (playerA.equals("S") && playerB.equals("R")) {
                IO.println("Rock breaks Scissors. Player B WINS.");
            }

            IO.println("Do you wanna play again? (Y/N) ");
            playAgain = in.nextLine().toUpperCase();
        }
        in.close();
    }
}




