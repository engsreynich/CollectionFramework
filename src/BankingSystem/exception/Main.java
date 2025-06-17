package BankingSystem.exception;

import BankingSystem.exception.model.ATM;
import BankingSystem.exception.model.CreditCardAccount;
import BankingSystem.exception.model.SavingAccount;

public class Main {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount(); //savingAccount is constctor
        savingAccount.setAccountName("My First Saving Account ");
        savingAccount.deposit(5000d);
        try{
            savingAccount.withdraw(500d);
        }catch (WithDrawException exception){
            System.out.println(exception.getMessage());
        }
        savingAccount.showBalance();
        savingAccount.getAccountName();
        ATM atm = new ATM((savingAccount));
        atm.withdraw(50d);
        savingAccount.showBalance();

        CreditCardAccount creditCardAccount = new CreditCardAccount();

    }
}