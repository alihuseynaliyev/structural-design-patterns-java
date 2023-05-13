package proxy;

public class RealBankAccount implements BankAccount {

    private double balance;

    public RealBankAccount(double initialAmount) {
        this.balance = initialAmount;
    }

    @Override
    public void deposit(double amoount) {
        this.balance += amoount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= balance) balance -= amount;
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
