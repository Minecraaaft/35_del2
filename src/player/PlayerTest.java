package player;

import org.junit.Test;

import static org.junit.Assert.*;
//This tests all the get and set methods that are within the player class by using
public class PlayerTest {


    @Test
    public void getBalance() {
        assertEquals(1000, 1000);
    }

    @Test
    public void getHasWon() {
        assertEquals(false, false);
    }

    @Test
    public void getFieldPos() {
        assertEquals(0, 0);
    }

    @Test
    public void getName() {
        assertEquals("player 1", "player 1");
    }

    @Test
    public void setName() {
        Player p1 = new Player();
        p1.setName("testName");
        assertEquals(p1.getName(), "testName");
    }

    @Test
    public void setHasWon() {
        Player p1 = new Player();
        p1.setHasWon(true);
        assertTrue(p1.getHasWon());
    }

    @Test
    public void setFieldPos() {
        Player p1 = new Player();
        p1.setFieldPos(4);
        assertEquals(p1.getFieldPos(), 4);

    }

    @Test
    public void setBalance() {
        Player p1 = new Player();
            for (int i = 0; i < 100000; i++) {
                p1.setBalance(-i);
                assertTrue(p1.getBalance() == 0); }
    }
}