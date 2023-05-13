package bridge;

public class OtherAccount extends Account{

    public OtherAccount(Card card) {
        super(card);
    }

    @Override
    public void openAccount() {
        System.out.println("Other account, ");
        card.cardType();
    }
}
