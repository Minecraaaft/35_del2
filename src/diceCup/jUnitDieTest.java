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
    //This test will test the probability of rolling the numbers 1-6 and compares it to the statistic value for 100000 rolls
    public void rollInside() {
        Die d1 = new Die(6);
        Die d2 = new Die(6);
        for (int i = 1; i < 100001; i++) {
            float roll1 = 0F, roll2 = 0F, roll3 = 0F, roll4 = 0F, roll5 = 0F, roll6 = 0F;

            switch (d1.roll()) {
                case 1:
                    roll1++;
                    break;
                case 2:
                    roll2++;
                    break;
                case 3:
                    roll3++;
                    break;
                case 4:
                    roll4++;
                    break;
                case 5:
                    roll5++;
                    break;
                case 6:
                    roll6++;
                    break;
            }

            switch (d2.roll()) {
                case 1:
                    roll1++;
                    break;
                case 2:
                    roll2++;
                    break;
                case 3:
                    roll3++;
                    break;
                case 4:
                    roll4++;
                    break;
                case 5:
                    roll5++;
                    break;
                case 6:
                    roll6++;
                    break;
            }
            assertEquals(1 / 6.*i, roll1/6, i / 6.);
            assertEquals(1 / 6.*i, roll2/6, i / 6.);
            assertEquals(1 / 6.*i, roll3/6, i / 6.);
            assertEquals(1 / 6.*i, roll4/6, i / 6.);
            assertEquals(1 / 6.*i, roll5/6, i / 6.);
            assertEquals(1 / 6.*i, roll6/6, i / 6.);
        }
    }
}