/**
 * Created by broadwells on 4/21/17.
 */
public abstract class Player {
    public String playerName;
    public enum Roshambo {
        ROCK,
        PAPER,
        SCISSORS;

        public static Roshambo getRandom() { //generating a random result for computer player "Rocky"
            return values ()[(int) (Math.random() * values().length)];
        }
    }

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public abstract String generateRoshambo();

    public abstract String generateRoshambo(String userChoice);
}
