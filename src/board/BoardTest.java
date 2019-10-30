package board;

import message.Message;

import static org.junit.Assert.*;

public class BoardTest {

    @org.junit.Test
    public void getFieldName() {
        Board myTestBoard = new Board("Dansk");

        assertEquals("Tower", myTestBoard.getFieldName(0));
        assertEquals("Crater", myTestBoard.getFieldName(1));
        assertEquals("Palace gates", myTestBoard.getFieldName(2));
        assertEquals("Cold Desert", myTestBoard.getFieldName(3));
        assertEquals("Walled city", myTestBoard.getFieldName(4));
        assertEquals("Monastery", myTestBoard.getFieldName(5));
        assertEquals("Black cave", myTestBoard.getFieldName(6));
        assertEquals("Huts in the mountain", myTestBoard.getFieldName(7));
        assertEquals("The Werewall (werewolf-wall)", myTestBoard.getFieldName(8));
        assertEquals("The pit", myTestBoard.getFieldName(9));
        assertEquals("Goldmine", myTestBoard.getFieldName(10));
    }

    @org.junit.Test
    public void getFieldNumber() {
        Board myTestBoard = new Board("Dansk");

        assertEquals(0, myTestBoard.getFieldNumber("Tower"));
        assertEquals(1, myTestBoard.getFieldNumber("Crater"));
        assertEquals(2, myTestBoard.getFieldNumber("Palace gates"));
        assertEquals(3, myTestBoard.getFieldNumber("Cold Desert"));
        assertEquals(4, myTestBoard.getFieldNumber("Walled city"));
        assertEquals(5, myTestBoard.getFieldNumber("Monastery"));
        assertEquals(6, myTestBoard.getFieldNumber("Black cave"));
        assertEquals(7, myTestBoard.getFieldNumber("Huts in the mountain"));
        assertEquals(8, myTestBoard.getFieldNumber("The Werewall (werewolf-wall)"));
        assertEquals(9, myTestBoard.getFieldNumber("The pit"));
        assertEquals(10, myTestBoard.getFieldNumber("Goldmine"));
    }

    @org.junit.Test
    public void getFieldMessage() {
        Board myTestBoard = new Board("Dansk");

        assertEquals("Du har fundet +250 i tårnet!", myTestBoard.getFieldMessage(0));
        assertEquals("Du tabte -100 i et krater.", myTestBoard.getFieldMessage(1));
        assertEquals("Du samlede en +100 seddel op fra jorden i Palace Gates.", myTestBoard.getFieldMessage(2));
        assertEquals("Du købte en termojakke og -20 er trukket fra din pengebeholdning.", myTestBoard.getFieldMessage(3));
        assertEquals("Du modtog din løn af +180, fra dit arbejde i Walled City.", myTestBoard.getFieldMessage(4));
        assertEquals("Du lever som en munk/nonne, din pengebeholdning forbliver uændret.", myTestBoard.getFieldMessage(5));
        assertEquals("Du tabte penge fra din lomme og kan ikke finde dem i den mørke hule, du har mistet -70.", myTestBoard.getFieldMessage(6));
        assertEquals("Du fandt en skattekiste indeholdende +60.", myTestBoard.getFieldMessage(7));
        assertEquals("Du gik ind gennem varulve-væggen! Du skal kaste terningerne igen for at undslippe, " +
                "pris -80", myTestBoard.getFieldMessage(8));
        assertEquals("Du faldt ned i et hul, en mand vil hjælpe dig, så længe du betaler ham 50.", myTestBoard.getFieldMessage(9));
        assertEquals("Jackpot! Du fandt en krukke fuld af guld, som du sælger for +650!", myTestBoard.getFieldMessage(10));

        Board myTestBoard2 = new Board("English");
        assertEquals("You just found +250 in the tower!", myTestBoard2.getFieldMessage(0));
        assertEquals("You -100 in a crater.", myTestBoard2.getFieldMessage(1));
        assertEquals("You picked up a +100 note on the ground in Palace Gates.", myTestBoard2.getFieldMessage(2));
        assertEquals("You bought a thermal jacket, and -20 have been withdrawn from your balance.", myTestBoard2.getFieldMessage(3));
        assertEquals("You received your salary of +180, from your work at Walled City.", myTestBoard2.getFieldMessage(4));
        assertEquals("You are living your life as a monk/nun, your balance remains the same.", myTestBoard2.getFieldMessage(5));
        assertEquals("You lost money from your pocket and can't find them in the black cave, you lost -70.", myTestBoard2.getFieldMessage(6));
        assertEquals("You found a treasure chest containing +60.", myTestBoard2.getFieldMessage(7));
        assertEquals("You just entered The Werewall! You have to throw the dice again to escape, cost -80.", myTestBoard2.getFieldMessage(8));
        assertEquals("You fell down The Pit, a man will help you up, as long as you pay him 50.", myTestBoard2.getFieldMessage(9));
        assertEquals("Jackpot! You just found a pot of gold, which you sell for +650!", myTestBoard2.getFieldMessage(10));
    }

    @org.junit.Test
    public void testGetFieldMessage() {
        Board myTestBoard = new Board("Dansk");

        assertEquals("Du har fundet +250 i tårnet!", myTestBoard.getFieldMessage("Tower"));
        assertEquals("Du tabte -100 i et krater.", myTestBoard.getFieldMessage("Crater"));
        assertEquals("Du samlede en +100 seddel op fra jorden i Palace Gates.", myTestBoard.getFieldMessage("Palace gates"));
        assertEquals("Du købte en termojakke og -20 er trukket fra din pengebeholdning.", myTestBoard.getFieldMessage("Cold Desert"));
        assertEquals("Du modtog din løn af +180, fra dit arbejde i Walled City.", myTestBoard.getFieldMessage("Walled city"));
        assertEquals("Du lever som en munk/nonne, din pengebeholdning forbliver uændret.", myTestBoard.getFieldMessage("Monastery"));
        assertEquals("Du tabte penge fra din lomme og kan ikke finde dem i den mørke hule, du har mistet -70.", myTestBoard.getFieldMessage("Black cave"));
        assertEquals("Du fandt en skattekiste indeholdende +60.", myTestBoard.getFieldMessage("Huts in the mountain"));
        assertEquals("Du gik ind gennem varulve-væggen! Du skal kaste terningerne igen for at undslippe, " +
                "pris -80", myTestBoard.getFieldMessage("The Werewall (werewolf-wall)"));
        assertEquals("Du faldt ned i et hul, en mand vil hjælpe dig, så længe du betaler ham 50.", myTestBoard.getFieldMessage("The pit"));
        assertEquals("Jackpot! Du fandt en krukke fuld af guld, som du sælger for +650!", myTestBoard.getFieldMessage("Goldmine"));

        Board myTestBoard2 = new Board("English");
        assertEquals("You just found +250 in the tower!", myTestBoard.getFieldMessage("Tower"));
        assertEquals("You -100 in a crater.", myTestBoard.getFieldMessage("Palace gates"));
        assertEquals("You picked up a +100 note on the ground in Palace Gates.", myTestBoard.getFieldMessage("Cold Desert"));
        assertEquals("You bought a thermal jacket, and -20 have been withdrawn from your balance.", myTestBoard.getFieldMessage("Walled city"));
        assertEquals("You received your salary of +180, from your work at Walled City.", myTestBoard.getFieldMessage("Monastery"));
        assertEquals("You are living your life as a monk/nun, your balance remains the same.", myTestBoard.getFieldMessage("Black cave"));
        assertEquals("You lost money from your pocket and can't find them in the black cave, you lost -70.", myTestBoard.getFieldMessage("Black cave"));
        assertEquals("You found a treasure chest containing +60.", myTestBoard.getFieldMessage("Huts in the mountain"));
        assertEquals("You just entered The Werewall! You have to throw the dice again to escape, cost -80." +
                "pris -80", myTestBoard.getFieldMessage("The Werewall (werewolf-wall)"));
        assertEquals("You fell down The Pit, a man will help you up, as long as you pay him 50.", myTestBoard.getFieldMessage("The pit"));
        assertEquals("Jackpot! You just found a pot of gold, which you sell for +650!", myTestBoard.getFieldMessage("Goldmine"));
    }

    @org.junit.Test
    public void getFieldCashPrize() {
        Board myTestBoard = new Board("Dansk");

        assertEquals(250, myTestBoard.getFieldCashPrize(0));
        assertEquals(-100, myTestBoard.getFieldCashPrize(1));
        assertEquals(100, myTestBoard.getFieldCashPrize(2));
        assertEquals(-20, myTestBoard.getFieldCashPrize(3));
        assertEquals(180, myTestBoard.getFieldCashPrize(4));
        assertEquals(0, myTestBoard.getFieldCashPrize(5));
        assertEquals(-70, myTestBoard.getFieldCashPrize(6));
        assertEquals(60, myTestBoard.getFieldCashPrize(7));
        assertEquals(-80, myTestBoard.getFieldCashPrize(8));
        assertEquals(-50, myTestBoard.getFieldCashPrize(9));
        assertEquals(650, myTestBoard.getFieldCashPrize(10));
    }

    @org.junit.Test
    public void testGetFieldCashPrize() {
        Board myTestBoard = new Board("Dansk");

        assertEquals(250, myTestBoard.getFieldCashPrize("Tower"));
        assertEquals(-100, myTestBoard.getFieldCashPrize("Crater"));
        assertEquals(100, myTestBoard.getFieldCashPrize("Palace gates"));
        assertEquals(-20, myTestBoard.getFieldCashPrize("Cold Desert"));
        assertEquals(180, myTestBoard.getFieldCashPrize("Walled city"));
        assertEquals(0, myTestBoard.getFieldCashPrize("Monastery"));
        assertEquals(-70, myTestBoard.getFieldCashPrize("Black cave"));
        assertEquals(60, myTestBoard.getFieldCashPrize("Huts in the mountain"));
        assertEquals(-80, myTestBoard.getFieldCashPrize("The Werewall (werewolf-wall)"));
        assertEquals(-50, myTestBoard.getFieldCashPrize("The pit"));
        assertEquals(650, myTestBoard.getFieldCashPrize("Goldmine"));
    }
}