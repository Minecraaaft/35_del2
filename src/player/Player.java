package player;

public class Player {

    // Attributes
    private String name;
    private static int playerNumber;
    private Balance balance = new Balance();
    private int fieldPos;
    private boolean hasWon;

    public Player() {
        this.name = "Player " + ++playerNumber;
        this.fieldPos = 0;

        this.hasWon = false;
    }


    //Getters
    public int getBalance() {
        return balance.getBalance();
    }
    public boolean getHasWon() {
        return hasWon;
    }
    public int getFieldPos() {
        return fieldPos;
    }
    public String getName() {
        return name;
    }

    //Setters
    public void setName(String name) {
        if (name.length() == 0)
            return;
        this.name = name;
    }
    public void setHasWon(boolean hasWon) {
       this.hasWon = hasWon;
    }
    public void setFieldPos(int fieldPos) {
        this.fieldPos = fieldPos;
    }
    public void setBalance(int points) {
        this.balance.setBalance(points);
    }
    public static void setPlayerNumber(int playerNumber) { Player.playerNumber = playerNumber; }
}
