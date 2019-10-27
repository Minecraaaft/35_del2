package board;

public class Field {
    private String name;
    private String message;
    private int cashPrize;
    private int fieldNumber;

    public Field(String name, String message, int cashPrize, int fieldNumber) {
        this.name = name;
        this.message = message;
        this.cashPrize = cashPrize;
        this.fieldNumber = fieldNumber;
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

    public int getFieldNumber() {
        return fieldNumber;
    }
}
