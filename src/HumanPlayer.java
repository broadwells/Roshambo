/**
 * Created by broadwells on 4/23/17.
 */
public class HumanPlayer extends Player {

    public HumanPlayer(String playerName) {
        super(playerName);
    }

    @Override
    public String generateRoshambo() {
        return null;
    }

    @Override
    public String generateRoshambo(String userChoice) {
        String roshamboResult = "";
        if (userChoice.equalsIgnoreCase(Roshambo.ROCK.toString())){

           roshamboResult = Roshambo.ROCK.toString();
        }
        else if (userChoice.equalsIgnoreCase(Roshambo.PAPER.toString())){

            roshamboResult = Roshambo.PAPER.toString();
        }
        else if (userChoice.equalsIgnoreCase(Roshambo.SCISSORS.toString())){

            roshamboResult = Roshambo.SCISSORS.toString();
        }
        return roshamboResult;
    }


}
