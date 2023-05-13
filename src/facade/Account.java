package facade;

import java.math.BigDecimal;

public class Account {
    BigDecimal balance;

    public Account() {
        balance = BigDecimal.TEN;
    }

    public BigDecimal deposit(BigDecimal amount) {
        return balance.add(amount);
    }

    public BigDecimal withdraw(BigDecimal amount) {
        return (balance.compareTo(amount) > 0) ? balance.subtract(amount) : BigDecimal.ZERO;
    }
}
