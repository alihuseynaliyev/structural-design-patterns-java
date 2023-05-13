package bridge;

public class DebitCard implements Card{
    @Override
    public void cardType() {
        System.out.println("Debit Card");
    }
}
