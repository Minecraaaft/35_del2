package diceCup;

public class DiceCup {
    private int sideNumber = 6;
    private int faceValueSum;
    private int[] faceValueArray = new int[2];

    private Die firstDie = new Die(sideNumber);
    private Die secondDie = new Die(sideNumber);

    //Constructor
    public DiceCup() {
    }

    public int rollDice() {
        faceValueArray[0] = firstDie.roll();
        faceValueArray[1] = secondDie.roll();

        faceValueSum = faceValueArray[0] + faceValueArray[1];
        return faceValueSum;
    }

    public int getFaceValueSum() {
        return faceValueSum;
    }

    public int[] getFaceValueArray() {
        return faceValueArray;
    }
}
