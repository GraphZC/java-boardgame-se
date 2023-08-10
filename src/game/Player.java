package game;

public class Player {
    private String name;
    private int takeTurn;
    private Piece piece;
    private Board board;
    private Die[] dice;

    public Player(String name, int takeTurn, Piece piece, Board board, Die[] dice) {
        this.name = name;
        setTakeTurn(takeTurn);
        this.piece = piece;
        this.board = board;
        this.dice = dice;
    }

    public String getName() {
        return name;
    }

    public int getTakeTurn() {
        return takeTurn;
    }

    private void setTakeTurn(int takeTurn) {
        if (takeTurn < 0) {
            takeTurn = 0;
        }
        if (takeTurn > 10) {
            takeTurn = 10;
        }
        this.takeTurn = takeTurn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Die[] getDice() {
        return dice;
    }

    public void setDice(Die[] dice) {
        this.dice = dice;
    }

    public void play() {
        int sum = 0;
        for (Die die : dice) {
            sum += die.roll();
        }
        Square[] squares = board.getSquares();
        int currentSquareIndex = piece.getLocation().getIndex();
        int newSquareIndex = (currentSquareIndex + sum) % board.getNumberOfSquare();
        piece.setLocation(squares[newSquareIndex]);
        System.out.println(name + " has rolled " + sum + " and landed on " + piece.getLocation().getName());
    }
}
