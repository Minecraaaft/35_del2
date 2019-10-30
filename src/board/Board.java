package board;

import message.Message;
import player.Player;

import static message.Message.*;

public class Board {
    Message message;
    Field[] fields = new Field[11];
    public Board(String language) {
        message = new Message(language);

        fields[0] = new Field("Tower", message.towerMessage(), 250, 0);
        fields[1] = new Field("Crater", message.craterMessage(), -100, 1);
        fields[2] = new Field("Palace gates", message.palaceGatesMessage(), 100, 2);
        fields[3] = new Field("Cold Desert", message.coldDesertMessage(), -20, 3);
        fields[4] = new Field("Walled city", message.walledCityMessage(), 180, 4);
        fields[5] = new Field("Monastery", message.monasteryMessage(), 0, 5);
        fields[6] = new Field("Black cave", message.blackCaveMessage(), -70, 6);
        fields[7] = new Field("Huts in the mountain", message.hutsInTheMountainMessage(), 60, 7);
        fields[8] = new Field("The Werewall (werewolf-wall)", message.theWerewallMessage(), -80, 8);
        fields[9] = new Field("The pit", message.thePitMessage(), -50, 9);
        fields[10] = new Field("Goldmine", message.goldmineMessage(), 650, 10);
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
        String message = fields[fieldNumber].getMessage();
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
        int cash = fields[fieldNumber].getCashPrize();
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
