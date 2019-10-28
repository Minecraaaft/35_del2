package diceCup;

public class DiceCup {
    private int sideNumber = 6;
    private int faceValueSum;
    private int firstDieValue;
    private int secondDieValue;
    private int[] faceValueArray;

    private Die firstDie = new Die(sideNumber);
    private Die secondDie = new Die(sideNumber);

    //Constructor
    public DiceCup(){
    }

    public void rollDice(){
        faceValueArray[0] = firstDie.roll();
        faceValueArray[1] = secondDie.roll();

        faceValueSum = faceValueArray[0] + faceValueArray[1];
    }

    public int getFaceValueSum() {
        return faceValueSum;
    }

    public int[] getFaceValueArray() {
        return faceValueArray;
    }
}
