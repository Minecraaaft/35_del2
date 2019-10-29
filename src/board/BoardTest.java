package board;

import message.Message;

import static org.junit.Assert.*;

public class BoardTest {
    Board myTestBoard = new Board();

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void getFieldName() {
        assertEquals(myTestBoard.getFieldName(0), "Tower");
        assertEquals(myTestBoard.getFieldName(1), "Crater");
        assertEquals(myTestBoard.getFieldName(2), "Palace gates");
        assertEquals(myTestBoard.getFieldName(3), "Cold Desert");
        assertEquals(myTestBoard.getFieldName(4), "Walled city");
        assertEquals(myTestBoard.getFieldName(5), "Monastery");
        assertEquals(myTestBoard.getFieldName(6), "Black cave");
        assertEquals(myTestBoard.getFieldName(7), "Huts in the mountain");
        assertEquals(myTestBoard.getFieldName(8), "The Werewall (werewolf-wall)");
        assertEquals(myTestBoard.getFieldName(9), "The pit");
        assertEquals(myTestBoard.getFieldName(10), "Goldmine");

    }

    @org.junit.Test
    public void getFieldNumber() {
    }

    @org.junit.Test
    public void getFieldMessage() {
    }

    @org.junit.Test
    public void testGetFieldMessage() {
    }

    @org.junit.Test
    public void getFieldCashPrize() {
    }

    @org.junit.Test
    public void testGetFieldCashPrize() {
    }
}