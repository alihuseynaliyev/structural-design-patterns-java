package bridge;

public abstract class Account {
    protected Card card;
    public Account(Card card){
        this.card = card;
    }

    public abstract void openAccount();
}
