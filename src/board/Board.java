package board;

import message.Message;

import static message.Message.*;

public class Board {
    Message message = new Message();
    Field[] fields = {
            new Field("Tower", message.towerMessage(), 250, 0),
            new Field("Crater", message.craterMessage(), -100, 1),
            new Field("Palace gates", message.palaceGatesMessage(), 100, 2),
            new Field("Cold Desert", message.coldDesertMessage(), -20, 3),
            new Field("Walled city", message.walledCityMessage(), 180, 4),
            new Field("Monastery", message.monasteryMessage(), 0, 5),
            new Field("Black cave", message.blackCaveMessage(), -70, 6),
            new Field("Huts in the mountain", message.hutsInTheMountainMessage(), 60, 7),
            new Field("The Werewall (werewolf-wall)", message.theWerewallMessage(), -80, 8),
            new Field("The pit", message.thePitMessage(), -50, 9),
            new Field("Goldmine", message.goldmineMessage(), 650, 10),
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
