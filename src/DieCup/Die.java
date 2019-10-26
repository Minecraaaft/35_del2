package DieCup;

import java.util.Random;

public class Die {
    // Attributter
    private int faceValue;

    // Konstruktør
    public Die(){
    }

    public int roll(){
        Random random = new Random();
        faceValue =random.nextInt(6)+1;
        return faceValue;
    }

    public int getFaceValue(){
        return faceValue;
    }


}
