package player;

import org.junit.Test;

import static org.junit.Assert.*;

public class jUnitBalanceTest {
    Player p1 = new Player();

    @Test
    public void setBalance() {
        for (int i = 0; i < 100000; i++) {
            p1.setBalance(-i);
            assertTrue(p1.getBalance()==0);
        }
    }
}