import java.util.InputMismatchException;

/**
 * Created by broadwells on 4/24/17.
 */
public class ValidateInput {
    public ValidateInput() {
    }

    public boolean opponentValid (String opponentName){ //validating userInput of opponent selection
        boolean beginAgain;
        try {
            if (opponentName.equalsIgnoreCase("rocky")) {
                beginAgain = true;
            }
            else if (opponentName.equalsIgnoreCase("sheargenius")) {
                beginAgain = true;
            }
            else {
                beginAgain = false; //inputs that are Strings but not the correct string
                System.out.println("Invalid entry. Please enter a valid selection!");
            }
            return beginAgain;
        }
        catch (InputMismatchException e){   //catching for inputs containing integer(s)
            System.out.println("Invalid entry. Please enter a valid selection!");
            beginAgain = false;
            return beginAgain;
        }
    }

    public boolean gamePieceValid (String userChoice){
        boolean tryAgain;
        try {
            if (userChoice.equalsIgnoreCase("rock")){
                tryAgain = true;
            }
            else if (userChoice.equalsIgnoreCase("paper")){
                tryAgain = true;
            }
            else if (userChoice.equalsIgnoreCase("scissors")){
                tryAgain = true;
            }
            else{
                tryAgain = false;
                System.out.println("Invalid entry. Please enter a valid selection!");
            }
            return tryAgain;
        }
        catch (InputMismatchException e){   //catching for inputs containing integer(s)
            System.out.println("Invalid entry. Please enter a valid selection!");
            tryAgain = false;
            return tryAgain;
        }
    }
}
