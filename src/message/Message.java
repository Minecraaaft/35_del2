package message;

public class Message {
    private static String language;

    public Message(String language) {
        Message.language = language;
    }

    public Message() {
        Message.language = "Dansk";
    }

    public void setLanguage(String language) {
        Message.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public String getEnterNameMessage(String playerName) {
        String message = "";
        switch (language) {
            case "English":
                message = playerName + ": Enter name:";
                break;
            case "Dansk":
                message = playerName + ": Indtast navn:";
                break;
        }

        return message;
    }

    public String getHasWonMessage(String playerName) {
        String message = "";
        switch (language) {
            case "English":
                message = playerName + " won!";
                break;
            case "Dansk":
                message = playerName + " vandt!";
                break;
        }

        return message;
    }

    public String getRollDiceMessage() {
        String message = "";
        switch (language) {
            case "English":
                message = "Roll dice";
                break;
            case "Dansk":
                message = "Kast terninger";
                break;
        }

        return message;
    }

    public String getTurnMessage(String playerName) {
        String message = "";
        switch (language) {
            case "English":
                message = "It's " + playerName + "s turn.";
                break;
            case "Dansk":
                message = "Det er " + playerName + "s tur.";
                break;
        }

        return message;
    }

    public String getEndTurnMessage(String playerName) {
        String message = "";
        switch (language) {
            case "English":
                message = playerName + "s turn has ended.";
                break;
            case "Dansk":
                message = playerName + "s tur er slut.";
                break;
        }

        return message;
    }

    public String getEndMessage() {
        String message = "";
        switch (language) {
            case "English":
                message = "End turn";
                break;
            case "Dansk":
                message = "Afslut tur";
                break;
        }

        return message;
    }

    public String towerMessage() {
        String message = "";
        switch (language) {
            case "English":
                message = "You just found +250 in the tower!";
                break;
            case "Dansk":
                message = "Du har fundet +250 i tårnet!";
                break;
        }

        return message;
    }

    public String craterMessage() {
        String message = "";
        switch (language) {
            case "English":
                message = "You -100 in a crater.";
                break;
            case "Dansk":
                message = "Du tabte -100 i et krater.";
                break;
        }

        return message;
    }

    public String palaceGatesMessage() {
        String message = "";
        switch (language) {
            case "English":
                message = "You picked up a +100 note on the ground in Palace Gates.";
                break;
            case "Dansk":
                message = "Du samlede en +100 seddel op fra jorden i Palace Gates.";
                break;
        }

        return message;
    }

    public String coldDesertMessage() {
        String message = "";
        switch (language) {
            case "English":
                message = "You bought a thermal jacket, and -20 have been withdrawn from your balance.";
                break;
            case "Dansk":
                message = "Du købte en termojakke og -20 er trukket fra din pengebeholdning.";
                break;
        }

        return message;
    }

    public String walledCityMessage() {
        String message = "";
        switch (language) {
            case "English":
                message = "You received your salary of +180, from your work at Walled City.";
                break;
            case "Dansk":
                message = "Du modtog din løn af +180, fra dit arbejde i Walled City.";
                break;
        }

        return message;
    }

    public String monasteryMessage() {
        String message = "";
        switch (language) {
            case "English":
                message = "You are living your life as a monk/nun, your balance remains the same.";
                break;
            case "Dansk":
                message = "Du lever som en munk/nonne, din pengebeholdning forbliver uændret.";
                break;
        }

        return message;
    }

    public String blackCaveMessage() {
        String message = "";
        switch (language) {
            case "English":
                message = "You lost money from your pocket and can't find them in the black cave, you lost -70.";
                break;
            case "Dansk":
                message = "Du tabte penge fra din lomme og kan ikke finde dem i den mørke hule, du har mistet -70.";
                break;
        }

        return message;
    }

    public String hutsInTheMountainMessage() {
        String message = "";
        switch (language) {
            case "English":
                message = "You found a treasure chest containing +60.";
                break;
            case "Dansk":
                message = "Du fandt en skattekiste indeholdende +60.";
                break;
        }

        return message;
    }

    public String theWerewallMessage() {
        String message = "";
        switch (language) {
            case "English":
                message = "You just entered The Werewall! You have to throw the dice again to escape, cost -80.";
                break;
            case "Dansk":
                message = "Du gik ind gennem varulve-væggen! Du skal kaste terningerne igen for at undslippe, " +
                        "pris -80";
                break;
        }

        return message;
    }

    public String thePitMessage() {
        String message = "";
        switch (language) {
            case "English":
                message = "You fell down The Pit, a man will help you up, as long as you pay him 50.";
                break;
            case "Dansk":
                message = "Du faldt ned i et hul, en mand vil hjælpe dig, så længe du betaler ham 50.";
                break;
        }

        return message;
    }

    public String goldmineMessage() {
        String message = "";
        switch (language) {
            case "English":
                message = "Jackpot! You just found a pot of gold, which you sell for +650!";
                break;
            case "Dansk":
                message = "Jackpot! Du fandt en krukke fuld af guld, som du sælger for +650!";
                break;
        }

        return message;
    }
}
