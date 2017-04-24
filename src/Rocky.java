/**
 * Created by broadwells on 4/21/17.
 */

public class Rocky extends Player{

    public Rocky(String playerName) {
        super(playerName);
    }
    //using .getRandom() to generate a random pull from the Roshambo enum
    @Override
    public String generateRoshambo() {
        Roshambo randomChoice = Roshambo.getRandom();
        return String.valueOf(randomChoice);
    }

    @Override
    public String generateRoshambo(String userChoice) {
        return null;
    }

}
