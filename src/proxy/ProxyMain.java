package proxy;

public class ProxyMain {
    public static void main(String[] args) {
        var proxyBankAccount = new ProxyBankAccount("test", "test");
        proxyBankAccount.deposit(175);
        proxyBankAccount.withdraw(100);
        System.out.println(proxyBankAccount.getBalance());

    }
}
