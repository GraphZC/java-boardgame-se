import game.MGame;
import game.Player;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob"};
        MGame game = new MGame(names);
        game.playGame();
    }

}