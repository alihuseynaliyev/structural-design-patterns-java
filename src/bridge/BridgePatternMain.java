package bridge;

public class BridgePatternMain {
    public static void main(String[] args) {
        var account = new MainAccount(new DebitCard());
        account.openAccount();
        System.out.println("-----------");
        var otherAccount = new OtherAccount(new SalaryCard());
        otherAccount.openAccount();
    }
}
