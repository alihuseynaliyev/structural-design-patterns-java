package proxy;

public class ProxyBankAccount implements BankAccount {

    private RealBankAccount realBankAccount;
    private final String username;
    private final String password;

    public ProxyBankAccount(String username, String password) {
        this.username = username;
        this.password = password;
    }

    private boolean authenticate() {
        return username.equalsIgnoreCase("test".trim()) && password.equals("test");
    }

    @Override
    public void deposit(double amoount) {
        if (authenticate()) getRealAccount().deposit(amoount);
        else System.out.println("Invalid credentials. Deposit operation is not allowed.");
    }

    @Override
    public void withdraw(double amount) {
        if (authenticate()) getRealAccount().withdraw(amount);
        else System.out.println("Invalid credentials. Withdraw operation is not allowed.");

    }

    @Override
    public double getBalance() {
        if (authenticate()) return getRealAccount().getBalance();
        else {
            System.out.println("Invalid credentials. Balance operation is not allowed.");
            return 0;
        }
    }

    private RealBankAccount getRealAccount() {
        return realBankAccount == null ?
                realBankAccount = new RealBankAccount(0) : realBankAccount;
    }


}
