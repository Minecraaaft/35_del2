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

    //method where you pay
//    public Pay(){
//
//    }

    //Getters
    public Balance getBalance(){
        return balance;
    }
    public boolean getHasWon(){
        return hasWon;
    }
    public int getFieldPos(){
        return fieldPos;
    }
    public String getName(){
        return name;
    }


    //Setters

    public void setName(String name) {
        this.name = name;
    }
    public void setHasWon(boolean hasWon){
       this.hasWon = hasWon;
    }
    public void setFieldPos(int fieldPos){
        this.fieldPos = fieldPos;
    }
    public void setBalance(int points){
        balance.setBalance(balance.getBalance()+points);
    }
}
