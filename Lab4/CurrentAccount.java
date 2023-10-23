package Lab4;
import java.time.LocalDate;

public class CurrentAccount extends BankAccount{
    private double overDraftLimit=200;//expressed as number of dollars
    private double balance;
    private LocalDate dateCreated = getDateCreated();
    private int id;
    private String accountName;

    //this makes overDraftLimit set to default which is 200 dollars
    public CurrentAccount(double balance, int id){
        super(id,balance);
        this.id=id;
        this.balance=balance;
    }

    public CurrentAccount(double balance, int id,String accountName){
        super(id,balance);
        this.id=id;
        this.balance=balance;
        this.accountName=accountName;
    }

    //can set a custom overdraft limit
    public CurrentAccount(double balance, int id, double overDraftLimit){
        super(id,balance);
        this.id=id;
        this.balance=balance;
        this.overDraftLimit = overDraftLimit;
    }

    public CurrentAccount(double balance, int id, double overDraftLimit,String accountName){
        super(id,balance);
        this.id=id;
        this.balance=balance;
        this.overDraftLimit = overDraftLimit;
        this.accountName = accountName;
    }


    
    
    @Override
    public void withdraw(double amount){
        if((balance+overDraftLimit)-amount>=0){
            balance-=amount;
        }
        
        else{
            System.out.println("Overdraft limit exceeded.");
        }
        
    }

    @Override
    public String toString(){
        if(accountName!=null){
            return accountName+"\nBalance: "+balance+"\nAccount Id: "+id+"\nDate created: "+dateCreated+"\nYour overdraft limit: "+overDraftLimit;
        }
        return "Balance: "+balance+"\nAccount Id: "+id+"\nDate created: "+dateCreated+"\nYour overdraft limit: "+overDraftLimit;
    }
}
