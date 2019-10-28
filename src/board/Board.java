package board;

import message.Message;

import static message.Message.*;

public class Board {
    Field[] fields = {
            new Field("Tower", towerMessage(), 250, 0),
            new Field("Crater", craterMessage(), -100, 1),
            new Field("Palace gates", palaceGatesMessage(), 100, 2),
            new Field("Cold Desert", coldDesertMessage(), -20, 3),
            new Field("Walled city", walledCityMessage(), 180, 4),
            new Field("Monastery", monasteryMessage(), 0, 5),
            new Field("Black cave", blackCaveMessage(), -70, 6),
            new Field("Huts in the mountain", hutsInTheMountainMessage(), 60, 7),
            new Field("The Werewall (werewolf-wall)", theWerewallMessage(), -80, 8),
            new Field("The pit", thePitMessage(), -50, 9),
            new Field("Goldmine", goldmineMessage(), 650, 10),
    };

    public Board() {
    }

    public String getFieldName(int fieldNumber) {
        String name = fields[fieldNumber].getName();
        return name;
    }

    public int getFieldNumber(String fieldName) {
        int fieldNumber = 404;
        for (Field a: fields) {
            if (fieldName == a.getName()) {
                fieldNumber = a.getFieldNumber();
            }
        }
        return fieldNumber;
    }

    public String getFieldMessage(int fieldNumber) {
        String message = fields[fieldNumber - 2].getMessage();
        return message;
    }

    public String getFieldMessage(String fieldName) {
        String message = "";
        for (Field a: fields) {
            if (fieldName == a.getName()) {
                message = a.getMessage();
            }
        }
        return message;
    }

    public int getFieldCashPrize(int fieldNumber) {
        int cash = fields[fieldNumber - 2].getCashPrize();
        return cash;
    }

    public int getFieldCashPrize(String fieldName) {
        int cash = 404;
        for (Field a: fields) {
            if (fieldName == a.getName()) {
                cash = a.getCashPrize();
            }
        }
        return cash;
    }


}
