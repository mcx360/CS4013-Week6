package Lab4.Part1;

import java.time.LocalDate;

public class SavingsAccount extends BankAccount{
    private double annualInterestRate = getAnnualInterestRate();
    private LocalDate dateCreated = LocalDate.now();//Uses LocalDate.now becuase a savings account doesn't necessarily have to be created at the same time as a current account
    private String accountName;

    public SavingsAccount(double balance, int id){
        super(id,balance);
    }

    public SavingsAccount(double balance, int id,String accountName){
        super(id,balance);
        this.accountName = accountName;
    }

    @Override
    public void withdraw(double amount){
        System.out.println("Can not withdraw funds from a savings account!");
    }

    @Override
    public String toString(){
        if(accountName!=null){
            return accountName+"\nBalance: "+getBalance()+"\nAccount Id: "+getId()+"\nDate created: "+dateCreated+"\nAnnual interest rate: "+annualInterestRate;
        }
        else{
            return "Balance: "+getBalance()+"\nAccount Id: "+getId()+"\nDate created: "+dateCreated+"\nAnnual interest rate: "+annualInterestRate;
    }
} 
}
