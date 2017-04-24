//author: Stephanie Broadwell
//lab #12
import java.util.Scanner;

/**
 * Created by broadwells on 4/21/17.
 */
public class RoshamboApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String opponent = "";
        System.out.println("Welcome! Let's play Rock, Paper, Scissors!");

        System.out.println("Please enter your name");
        String player = scan.nextLine();
        HumanPlayer player1 = new HumanPlayer(player);
        ShearGenius player2 = new ShearGenius("ShearGenius");
        Rocky player3 = new Rocky("Rocky");

        boolean valid = false;  //validating the user enters only 'Rocky' or 'ShearGenius'
        while (!valid) {
            System.out.println(player + ", please choose your opponent. \nRocky or ShearGenius? " +
                    "(Rocky/ShearGenius): ");
            opponent = scan.nextLine();
            ValidateInput checkOpponent = new ValidateInput();
            valid = checkOpponent.opponentValid(opponent);   //if returned as false, the loop will begin again
        }

        boolean validInput = false;
        boolean startOver = true;
        String playChoice = "";
        String result;
        int ties = 0;
        int win1 = 0;
        int win2 = 0;
        int loss1 = 0;
        int loss2 = 0;
        while (startOver) {
            while (!validInput) {   //validating the user enters only the selections listed
                System.out.println("Rock, paper, or scissors? (rock/paper/scissors): ");
                playChoice = scan.nextLine();
                ValidateInput checkAnswer = new ValidateInput();
                validInput = checkAnswer.gamePieceValid(playChoice);
            }
            if (opponent.equalsIgnoreCase("rocky")){
                //declaring the Roshambo result to human and rocky to pass to winner method
                String human = player1.generateRoshambo(playChoice);
                String rocky = player3.generateRoshambo();

                System.out.println(player1.getPlayerName() + ": " + human.toLowerCase());
                System.out.println(player3.getPlayerName() + ": " + rocky.toLowerCase());

                result = winner(human, rocky);   //prints out the result of the match
                if (result.equals("draw")) {
                    System.out.println("Draw!");
                    ties += 1;
                }
                else if (result.equals("p1")) {
                    System.out.println(player1.getPlayerName() + " wins!");
                    win1 += 1;
                    loss1 += 1;
                }
                else if (result.equals("p2")) {
                    System.out.println(player3.getPlayerName() + " wins!");
                    win2 += 1;
                    loss2 += 1;
                }

            }
            else if (opponent.equalsIgnoreCase("sheargenius")){
                String human = player1.generateRoshambo(playChoice);
                String shearGenius = player2.generateRoshambo();

                System.out.println(player1.getPlayerName() + ": " + human.toLowerCase());
                System.out.println(player2.getPlayerName() + ": " + shearGenius.toLowerCase());

                result = winner(human, shearGenius);
                switch (result) {
                    case "draw":
                        System.out.println("Draw!");
                        ties += 1;
                        break;
                    case "p1":
                        System.out.println(player1.getPlayerName() + " wins!");
                        win1 += 1;
                        loss1 += 1;
                        break;
                    case "p2":
                        System.out.println(player2.getPlayerName() + " wins!");
                        win2 += 1;
                        loss2 += 1;
                        break;
                }

            }

            System.out.println("Play again? (y/n): ");
            String again = scan.nextLine();
            again.toLowerCase();
            if (again.contains("n")) {
                System.out.println("Thanks for playing " + player + "!");
                startOver = false;
            }
            else {
                validInput = false;
            }

            //keeping score of wins/losses and ties
            System.out.println(player1.getPlayerName() + " has won " + win1 + " matches, and lost " + loss2 + " " +
                    "matches!");
            if (opponent.equalsIgnoreCase("sheargenius")) {
                System.out.println(player2.getPlayerName() + " has won " + win2 + " matches, and lost " + loss1 + " " +
                        "matches!");
            }
            else if (opponent.equalsIgnoreCase("rocky")){
                System.out.println(player3.getPlayerName() + " has won " + win2 + " matches, and lost " + loss1 + " " +
                        "matches!");
            }
            System.out.println(ties + " ties!");
            System.out.println();
        }

    }

    public static String winner(String p1Val, String p2Val){
        if (p1Val.equalsIgnoreCase("rock") && p2Val.equalsIgnoreCase("rock") ||
                p1Val.equalsIgnoreCase("scissors") && p2Val.equalsIgnoreCase("scissors") ||
                p1Val.equalsIgnoreCase("paper") && p2Val.equalsIgnoreCase("paper")){
            return "draw";
        }
        else {
            if (p1Val.equalsIgnoreCase("rock") && p2Val.equalsIgnoreCase("paper") ||
                    p1Val.equalsIgnoreCase("scissors") && p2Val.equalsIgnoreCase("rock") ||
                    p1Val.equalsIgnoreCase("paper") && p2Val.equalsIgnoreCase("scissors")){
                return "p2";
            }
            else if (p1Val.equalsIgnoreCase("paper") && p2Val.equalsIgnoreCase("rock") ||
                    p1Val.equalsIgnoreCase("rock") && p2Val.equalsIgnoreCase("scissors") ||
                    p1Val.equalsIgnoreCase("scissors") && p2Val.equalsIgnoreCase("paper")){
                return "p1";
            }
        }
        return null;
    }
}
