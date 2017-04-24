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
        String temp = "";
        if (userChoice.equalsIgnoreCase(Roshambo.ROCK.toString())){

            return Roshambo.ROCK.toString();
        }
        else if (userChoice.equalsIgnoreCase(Roshambo.PAPER.toString())){

            return Roshambo.PAPER.toString();
        }
        else if (userChoice.equalsIgnoreCase(Roshambo.SCISSORS.toString())){

            return Roshambo.SCISSORS.toString();
        }
        return temp;
    }


}
