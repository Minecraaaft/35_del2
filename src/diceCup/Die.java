package diceCup;

import java.util.Random;

public class Die {
    // Attributter
    private int faceValue;

    // Konstruktør
    public Die(){
    }

    // generating a number from 1-6 and returning it
    public int roll(){
        Random random = new Random();
        faceValue =random.nextInt(6)+1;
        return faceValue;
    }

    public int getFaceValue(){
        return faceValue;
    }

}
