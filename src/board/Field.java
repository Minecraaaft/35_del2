package board;

public class Field {
    private String name;
    private String message;
    private int cashPrize;

    public Field(String name, String message, int cashPrize) {
        this.name = name;
        this.message = message;
        this.cashPrize = cashPrize;
    }

    public String getName() {
        return name;
    }

    public int getCashPrize() {
        return cashPrize;
    }

    public String getMessage() {
        return message;
    }
}
