package player;

public class Balance {
    //Attributes
    private int balance = 1000;

    public void setBalance(int balance) {
        if (balance < 0) {
            this.balance = 0;
            return;
        }
        this.balance = balance;
    }

    public int getBalance(){
        return balance;
    }
}
