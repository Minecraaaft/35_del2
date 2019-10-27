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
                message = "It's " +  "s turn.";
            case "Dansk":
                message = "Det er " + "s tur.";
        }

        return message;
    }

    public static String craterMessage() {
        String message = "";
        switch (language) {
            case "English":
                message = "It's " +  "s turn.";
            case "Dansk":
                message = "Det er " + "s tur.";
        }

        return message;
    }

    public static String palaceGatesMessage() {
        String message = "";
        switch (language) {
            case "English":
                message = "It's " +  "s turn.";
            case "Dansk":
                message = "Det er " + "s tur.";
        }

        return message;
    }

    public static String coldDesertMessage() {
        String message = "";
        switch (language) {
            case "English":
                message = "It's " +  "s turn.";
            case "Dansk":
                message = "Det er " + "s tur.";
        }

        return message;
    }

    public static String walledCityMessage() {
        String message = "";
        switch (language) {
            case "English":
                message = "It's " +  "s turn.";
            case "Dansk":
                message = "Det er " + "s tur.";
        }

        return message;
    }

    public static String monasteryMessage() {
        String message = "";
        switch (language) {
            case "English":
                message = "It's " +  "s turn.";
            case "Dansk":
                message = "Det er " + "s tur.";
        }

        return message;
    }

    public static String blackCaveMessage() {
        String message = "";
        switch (language) {
            case "English":
                message = "It's " +  "s turn.";
            case "Dansk":
                message = "Det er " + "s tur.";
        }

        return message;
    }

    public static String hutsInTheMountainMessage() {
        String message = "";
        switch (language) {
            case "English":
                message = "It's " +  "s turn.";
            case "Dansk":
                message = "Det er " + "s tur.";
        }

        return message;
    }

    public static String theWerewallMessage() {
        String message = "";
        switch (language) {
            case "English":
                message = "It's " +  "s turn.";
            case "Dansk":
                message = "Det er " + "s tur.";
        }

        return message;
    }

    public static String thePitMessage() {
        String message = "";
        switch (language) {
            case "English":
                message = "It's " +  "s turn.";
            case "Dansk":
                message = "Det er " + "s tur.";
        }

        return message;
    }

    public static String goldmineMessage() {
        String message = "";
        switch (language) {
            case "English":
                message = "It's " +  "s turn.";
            case "Dansk":
                message = "Det er " + "s tur.";
        }

        return message;
    }
}
