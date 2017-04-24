/**
 * Created by broadwells on 4/21/17.
 */
public class ShearGenius extends Player {

    public ShearGenius(String playerName) {
        super(playerName);
    }
    //ShearGenius will always throw "Rock"
    @Override
    public String generateRoshambo() {
        return Roshambo.ROCK.toString();
    }

    @Override
    public String generateRoshambo(String userChoice) {
        return null;
    }

}
