package game;

public class Die {
    int faceValue;

    public Die() {
        faceValue = 0;
    }

    public int roll() {
        faceValue = (int) (Math.random() * 6) + 1;
        return faceValue;
    }
}
