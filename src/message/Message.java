package message;

public class Message {
    private static String language;

    public Message(String language) {
        Message.language = language;
    }

    public static String getMessage(String playerName) {
        String message = "";
        switch (language) {
            case "English":
                message = "It's " + playerName + "s turn.";
            case "Dansk":
                message = "Det er " + playerName + "s tur.";
        }

        return message;
    }

    public static String towerMessage() {
        String message = "";
        switch (language) {
            case "English":
                message = "You just found +250 in the tower!";
            case "Dansk":
                message = "Du har fundet +250 i tårnet!";
        }

        return message;
    }

    public static String craterMessage() {
        String message = "";
        switch (language) {
            case "English":
                message = "You -100 in a crater.";
            case "Dansk":
                message = "Du tabte -100 i et krater.";
        }

        return message;
    }

    public static String palaceGatesMessage() {
        String message = "";
        switch (language) {
            case "English":
                message = "You picked up a +100 note on the ground in Palace Gates.";
            case "Dansk":
                message = "Du samlede en +100 seddel op fra jorden i Palace Gates.";
        }

        return message;
    }

    public static String coldDesertMessage() {
        String message = "";
        switch (language) {
            case "English":
                message = "You bought a thermal jacket, and -20 have been withdrawn from your balance.";
            case "Dansk":
                message = "Du købte en termojakke og -20 er trukket fra din pengebeholdning.";
        }

        return message;
    }

    public static String walledCityMessage() {
        String message = "";
        switch (language) {
            case "English":
                message = "You received your salary of +180, from your work at Walled City.";
            case "Dansk":
                message = "Du modtog din løn af +180, fra dit arbejde i Walled City.";
        }

        return message;
    }

    public static String monasteryMessage() {
        String message = "";
        switch (language) {
            case "English":
                message = "You are living your life as a monk/nun, your balance remains the same.";
            case "Dansk":
                message = "Du lever som en munk/nonne, din pengebeholdning forbliver uændret.";
        }

        return message;
    }

    public static String blackCaveMessage() {
        String message = "";
        switch (language) {
            case "English":
                message = "You lost money from your pocket and can't find them in the black cave, you lost -70.";
            case "Dansk":
                message = "Du tabte penge fra din lomme og kan ikke finde dem i den mørke hule, du har mistet -70.";
        }

        return message;
    }

    public static String hutsInTheMountainMessage() {
        String message = "";
        switch (language) {
            case "English":
                message = "You found a treasure chest containing +60.";
            case "Dansk":
                message = "Du fandt en skattekiste indeholdende +60.";
        }

        return message;
    }

    public static String theWerewallMessage() {
        String message = "";
        switch (language) {
            case "English":
                message = "You just entered The Werewall! You have to throw the dice again to escape, cost -80.";
            case "Dansk":
                message = "Du gik ind gennem varulve-væggen! Du skal kaste terningerne igen for at undslippe, " +
                        "pris -80";
        }

        return message;
    }

    public static String thePitMessage() {
        String message = "";
        switch (language) {
            case "English":
                message = "You fell down The Pit, a man will help you up, as long as you pay him 50.";
            case "Dansk":
                message = "Du faldt ned i et hul, en mand vil hjælpe dig, så længe du betaler ham 50.";
        }

        return message;
    }

    public static String goldmineMessage() {
        String message = "";
        switch (language) {
            case "English":
                message = "Jackpot! You just found a pot of gold, which you sell for +650!";
            case "Dansk":
                message = "Jackpot! Du fandt en krukke fuld af guld, som du sælger for +650!";
        }

        return message;
    }
}
