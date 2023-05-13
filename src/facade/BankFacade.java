package facade;

import java.math.BigDecimal;

public class BankFacade {
    private Account account;
    private Loan loan;
    public BankFacade(Account account, Loan loan) {
        this.account = account;
        this.loan = loan;
    }

    public void deposit(BigDecimal amount){
        System.out.println(account.deposit(amount));
    }

    public void withdraw(BigDecimal amount){
        System.out.println(account.withdraw(amount));
    }

    public void applyLoan(){
        loan.apply();
    }
}
