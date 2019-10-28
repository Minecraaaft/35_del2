package player;

public class Player {

    // Attributes
    private String name;
    private static int playerNumber;
    private Balance balance = new Balance();
    private int fieldPos;
    private boolean hasWon;

    public Player(){
        this.name = "Player" + ++playerNumber;
        this.fieldPos = 0;

        this.hasWon = false;
    }

    public boolean getHasWon(){
        return hasWon;
    }
    //Setters
    public void setHasWon(boolean hasWon){
       this.hasWon = hasWon;
    }
}
