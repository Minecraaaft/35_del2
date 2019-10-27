package board;

import message.Message;

import static message.Message.*;

public class Board {
    Field[] fields = {
            new Field("Tower", towerMessage(), 250),
            new Field("Crater", craterMessage(), -100),
            new Field("Palace gates", palaceGatesMessage(), 100),
            new Field("Cold Desert", coldDesertMessage(), -20),
            new Field("Walled city", walledCityMessage(), 180),
            new Field("Monastery", monasteryMessage(), 0),
            new Field("Black cave", blackCaveMessage(), -70),
            new Field("Huts in the mountain", hutsInTheMountainMessage(), 60),
            new Field("The Werewall (werewolf-wall)", theWerewallMessage(), -80),
            new Field("The pit", thePitMessage(), -50),
            new Field("Goldmine", goldmineMessage(), 650),
    };


}
