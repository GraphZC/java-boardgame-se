package game;

public class MGame {
    private final int MAX_ROUNDS = 10;
    private int roundCut;
    private final Die[] dice;
    private final Player[] players;
    private Board board;
    public MGame(String[] playerNames) {
        roundCut = 1;
        dice = new Die[2];

        // Create two dice
        dice[0] = new Die();
        dice[1] = new Die();

        this.board = new Board();

        players = new Player[playerNames.length];
        for (int i = 0; i < playerNames.length; i++) {
            Square startSquare =  board.getSquares()[0];
            players[i] = new Player(playerNames[i], i + 1, new Piece(startSquare), board, dice);
        }
    }
    public void playGame() {
        while (roundCut <= MAX_ROUNDS) {
            playRound();
        }
    }

    private void playRound() {
        System.out.println("======= Round " + roundCut + " start. ======= ");
        for (Player player : players) {
            player.play();
        }
        System.out.println();
        roundCut++;
    }
}
