package game;

public class Board {
    private final int NUMBER_OF_SQUARE = 40;
    private Square[] squares;

    public Board() {
        squares = new Square[40];
        for (int i = 0; i < NUMBER_OF_SQUARE; i++) {
            squares[i] = new Square(i, "Square " + (i + 1));
        }
    }

    public Square[] getSquares() {
        return squares;
    }

    public int getNumberOfSquare() {
        return NUMBER_OF_SQUARE;
    }
}