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
