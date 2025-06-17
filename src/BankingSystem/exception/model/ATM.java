package BankingSystem.exception.model;

import BankingSystem.exception.service.BankingService;

public class ATM implements BankingService {
    private Account account;
    public ATM( Account account){
        this.account = account;
    }

    @Override
    public void withdraw(Double cash) {
        account.withdraw(cash);
    }

    @Override
    public void deposit(Double cash) {
        account.deposit(cash);
    }

    @Override
    public void showBalance() {
        account.showBalance();
    }
}
