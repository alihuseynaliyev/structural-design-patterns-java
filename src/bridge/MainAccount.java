package bridge;

public class MainAccount extends Account{
    public MainAccount(Card card) {
        super(card);
    }

    @Override
    public void openAccount() {
        System.out.println("Main account, ");
        card.cardType();
    }
}
