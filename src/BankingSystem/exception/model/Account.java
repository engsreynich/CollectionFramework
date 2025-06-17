package BankingSystem.exception.model;

import BankingSystem.exception.WithDrawException;
import BankingSystem.exception.service.BankingService;

public class Account implements BankingService {
    private String accountName = null;
    private Double balance = 0.0;

    @Override    //Generete + Override Method
    public void  withdraw(Double cash){
        if (cash<0 || cash>balance){
            throw new WithDrawException("លុយមិនគ្រប់គ្រាន់ ក្នុងគណនី ឬ បញ្ចូលចំនួនខុស");
        }
        balance -= cash ;// balance = balance - cash
        System.out.println("[😉] លុយដកបានសម្រេច");
    }

    @Override
    public void deposit(Double cash) {
    if (cash<0){
        System.out.println("[!] Invalid number.");
    }else {
        balance += cash; //balance = balance +cash
        System.out.println("[✌️] ដាក់លុយបានសម្រេច");
    }

    }

    @Override
    public void showBalance() {
        System.out.println("=".repeat(30));
        System.out.println("Your balance number:" + this.balance);
        System.out.println("=".repeat(30));
    }
    public void getAccountName(){
        System.out.println("BankingSystem.exception.model.Account: "+this.accountName);
    }
    public void setAccountName(String accountName){
        this.accountName = accountName;
    }
}
