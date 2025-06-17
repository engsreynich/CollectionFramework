package BankingSystem.exception.service;

public interface BankingService {
    void withdraw(Double cash);
    void deposit(Double cash);
    void showBalance();
}
