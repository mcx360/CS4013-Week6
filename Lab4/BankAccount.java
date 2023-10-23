package Lab4;
import java.time.LocalDate;

public class BankAccount {
    private int id;
    private double balance;
    private static double annualInterestRate;
    private static final LocalDate dateCreated = LocalDate.now();
    private String accountName;

    public BankAccount(int id,double balance){
        this.id=id;
        this.balance=balance;
    }

    public BankAccount(int id,double balance,String accountName){
        this.id=id;
        this.balance=balance;
        this.accountName=accountName;
    }

    public int getId(){
        return id;
    }

    public double getBalance(){
        return balance;
    }

    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public void setId(int id){
        this.id=id;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate){
        BankAccount.annualInterestRate = annualInterestRate;
    }

    public LocalDate getDateCreated(){
        return dateCreated;
    }

    public double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }

    public void withdraw(double amount){
        balance = balance-amount;
    }

    public void deposit(double amount){
        balance+=amount;
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
