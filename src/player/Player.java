package player;

public class Player {

    // Attributes
    private String name;
    private static int playerNumber;
    private Balance balance = new Balance();
    private int fieldPos;
    private boolean hasLost;

    public Player(){
        this.name = "Player" + ++playerNumber;
        this.fieldPos = 0;

        this.hasLost = false;
    }

    public boolean isHasLost(){
        return hasLost;
    }
    //Setters
    public void setHasLost(boolean hasLost){
       this.hasLost = hasLost; 
    }
}
