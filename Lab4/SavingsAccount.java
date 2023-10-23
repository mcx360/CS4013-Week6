package Lab4;

import java.time.LocalDate;

public class SavingsAccount extends BankAccount{
    private double balance;
    private double annualInterestRate = getAnnualInterestRate();
    private LocalDate dateCreated = LocalDate.now();//Uses LocalDate.now becuase a savings account doesn't necessarily have to be created at the same time as a current account
    private int id;
    private String accountName;
    

    public SavingsAccount(double balance, int id){
        super(id,balance);
        this.balance = balance;
        this.id = id;
    }

    public SavingsAccount(double balance, int id,String accountName){
        super(id,balance);
        this.balance = balance;
        this.id = id;
        this.accountName = accountName;
    }

    @Override
    public void withdraw(double amount){
        System.out.println("Can not withdraw funds from a savings account!");
    }

    @Override
    public String toString(){
        if(accountName!=null){
            return accountName+"\nBalance: "+balance+"\nAccount Id: "+id+"\nDate created: "+dateCreated+"\nAnnual interest rate: "+annualInterestRate;
        }
        else{
            return "Balance: "+balance+"\nAccount Id: "+id+"\nDate created: "+dateCreated+"\nAnnual interest rate: "+annualInterestRate;
    }
} 
}
