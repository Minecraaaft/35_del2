package message;

public class Message {
    private String language;

    public Message(String language) {
        this.language = language;
    }

    public String getMessage(String playerName) {
        String message = "";
        switch (language) {
            case "English":
                message = "It's " + playerName + "s turn.";
            case "Dansk":
                message = "Det er " + playerName + "s tur.";
        }

        return message;
    }
}
