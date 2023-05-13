package facade;

import java.math.BigDecimal;

public class BankFacadeMain {
    public static void main(String[] args) {
        var bankFacade = new BankFacade(new Account(), new Loan());
        bankFacade.withdraw(BigDecimal.TWO);
        bankFacade.deposit(BigDecimal.TEN);
    }
}
