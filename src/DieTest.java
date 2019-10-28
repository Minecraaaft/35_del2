import diceCup.Die;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DieTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nsides = 0, rolls = 0;

        while (true) {
            try {
                System.out.print("Insert number of sides on die as an integer: ");
                nsides = scan.nextInt();
                System.out.print("Insert amount of rolls as an integer: ");
                rolls = scan.nextInt();

                Die d1 = new Die(nsides);
                Die d2 = new Die(nsides);

                int rollsafter = 0;
                for (int i = 0; i < rolls; i++) {
                    System.out.println(d1.roll());
                    System.out.println(d2.roll());
                    if (d1.roll() > nsides || d1.roll() < 0) {
                        System.out.println(0);
                    }

                    if (d2.roll() > nsides || d1.roll() < 0) {
                        System.out.println(0);
                    }


                    rollsafter++;
                }
                if (rollsafter == rolls) {
                    System.out.println("Number of rolls: " + rollsafter + " without any fails");
                } else {
                    System.out.println("There was an error with the system");
                }
            } catch (InputMismatchException e) {
                System.out.println("You did not write an integer. Try again!");
                scan.next();
            }
        }
    }
}