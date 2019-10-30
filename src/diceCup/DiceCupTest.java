package diceCup;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DiceCupTest {

    DiceCup myTestDicecup = new DiceCup();

    @Test
    public void rollDice() {
        for (int i = 0; i < 10000; i++) {
            assertEquals(7, myTestDicecup.rollDice(), 5);
        }
    }

    @Test
    public void rollDiceOutcome() {
        int[] arr = new int[11];

        for (int i = 0; i < 10000; i++) {
            int value = myTestDicecup.rollDice();
            switch (value) {
                case 2:
                    arr[0]++;
                    break;
                case 3:
                    arr[1]++;
                    break;
                case 4:
                    arr[2]++;
                    break;
                case 5:
                    arr[3]++;
                    break;
                case 6:
                    arr[4]++;
                    break;
                case 7:
                    arr[5]++;
                    break;
                case 8:
                    arr[6]++;
                    break;
                case 9:
                    arr[7]++;
                    break;
                case 10:
                    arr[8]++;
                    break;
                case 11:
                    arr[9]++;
                    break;
                case 12:
                    arr[10]++;
                    break;
            }

            assertEquals(1667, arr[0], 330);
            assertEquals(1667, arr[1], 330);
            assertEquals(1667, arr[2], 330);
            assertEquals(1667, arr[3], 330);
            assertEquals(1667, arr[4], 330);
            assertEquals(1667, arr[5], 330);
            assertEquals(1667, arr[6], 330);
            assertEquals(1667, arr[7], 330);
            assertEquals(1667, arr[8], 330);
            assertEquals(1667, arr[9], 330);
            assertEquals(1667, arr[10], 330);

        }
    }

}