package diceCup;

import static org.junit.Assert.*;

public class jUnitDieTest {
    int nsides = 6; //sides on die

    @org.junit.Test
    //This test will test if the rolls are between 1 and nsides in 1000000 rolls
    public void rollOutside() {
        Die d1 = new Die(nsides);
        Die d2 = new Die(nsides);

        for (int i = 0; i < 1000000; i++) {
            assertEquals(nsides / 2. + 0.5, d1.roll(), nsides / 2. - 0.5);
            assertEquals(nsides / 2. + 0.5, d2.roll(), nsides / 2. - 0.5);
        }
    }

    @org.junit.Test
    //This test will test the probability of rolling the numbers 1-6 and compares it to the statistic value for 60000 rolls
    public void rollInside() {
        Die d1 = new Die(6);
        Die d2 = new Die(6);
        float roll1 = 0F, roll2 = 0F, roll3 = 0F, roll4 = 0F, roll5 = 0F, roll6 = 0F;
        int antalRolls = 0;
        int antalDice = 2;
        //            float array[] = {roll1,roll2,roll3,roll4,roll5,roll6};

        for (int i = 1; i < 60001; i++) {
            switch (d1.roll()) {
                case 1:
                    roll1++;
//                    array[0]++;
                    break;
                case 2:
                    roll2++;
//                    array[1]++;
                    break;
                case 3:
                    roll3++;
//                    array[2]++;
                    break;
                case 4:
                    roll4++;
//                    array[3]++;
                    break;
                case 5:
                    roll5++;
//                    array[4]++;
                    break;
                case 6:
                    roll6++;
//                    array[5]++;
                    break;
            }
            antalRolls++;


            switch (d2.roll()) {
                case 1:
                    roll1++;
//                    array[0]++;
                    break;
                case 2:
                    roll2++;
//                    array[1]++;
                    break;
                case 3:
                    roll3++;
//                    array[2]++;
                    break;
                case 4:
                    roll4++;
//                    array[3]++;
                    break;
                case 5:
                    roll5++;
//                    array[4]++;
                    break;
                case 6:
                    roll6++;
//                    array[5]++;
                    break;
            }
            antalRolls++;

        }
        assertEquals(antalRolls / 6., roll1, 400.*antalDice);
        assertEquals(antalRolls / 6., roll2, 400.*antalDice);
        assertEquals(antalRolls / 6., roll3, 400.*antalDice);
        assertEquals(antalRolls / 6., roll4, 400.*antalDice);
        assertEquals(antalRolls / 6., roll5, 400.*antalDice);
        assertEquals(antalRolls / 6., roll6, 400.*antalDice);
        System.out.println("Number of 1's rolled: " + roll1 + ". The expected number is: " + (antalRolls / 6.) +
                ". The difference is: " + Math.abs((antalRolls / 6. - roll1)) + " which is less than " + 400*antalDice);

        System.out.println("Number of 2's rolled: " + roll2 + ". The expected number is: " + (antalRolls / 6.) +
                ". The difference is: " + Math.abs((antalRolls / 6. - roll2)) + " which is less than " + 400*antalDice);

        System.out.println("Number of 3's rolled: " + roll3 + ". The expected number is: " + (antalRolls / 6.) +
                ". The difference is: " + Math.abs((antalRolls / 6. - roll3)) + " which is less than " + 400*antalDice);

        System.out.println("Number of 4's rolled: " + roll4 + ". The expected number is: " + (antalRolls / 6.) +
                ". The difference is: " + Math.abs((antalRolls / 6. - roll4)) + " which is less than " + 400*antalDice);

        System.out.println("Number of 5's rolled: " + roll5 + ". The expected number is: " + (antalRolls / 6.) +
                ". The difference is: " + Math.abs((antalRolls / 6. - roll5)) + " which is less than " + 400*antalDice);

        System.out.println("Number of 6's rolled: " + roll6 + ". The expected number is: " + (antalRolls / 6.) +
                ". The difference is: " + Math.abs((antalRolls / 6. - roll6)) + " which is less than " + 400*antalDice);
    }
}