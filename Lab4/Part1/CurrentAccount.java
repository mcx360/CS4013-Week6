package Lab4.Part1;
import java.time.LocalDate;

public class CurrentAccount extends BankAccount{
    private double overDraftLimit=200;//expressed as number of dollars, default overdraft limit is set to 200
    //private double balance;
    private LocalDate dateCreated = getDateCreated();
    //private int id;
    private String accountName;
    

    //this makes overDraftLimit set to default which is 200 dollars
    public CurrentAccount(int id,double balance){
        super(id,balance);   
        //this.id=id;
        //this.balance=balance;

    }

    

    public CurrentAccount(double balance, int id,String accountName){
        super(id,balance);
        //this.id=id;
        //this.balance=balance;
        this.accountName=accountName;
    }

    //can set a custom overdraft limit
    public CurrentAccount(double balance, int id, String accountName,double overDraftLimit){
        super(id,balance);
        //this.id=id;
        //this.balance=balance;
        this.overDraftLimit = overDraftLimit;
        this.accountName = accountName;
    }

    
    
    @Override
    public void withdraw(double amount){
        if((getBalance()+overDraftLimit)-amount>=0){
            //getBalance()-=amount;
            setBalance(getBalance()-amount);
        }
        
        else{
            //nothing happens as payment is declined
        }
        
    }

    @Override
    public String toString(){
        if(accountName!=null){
            return accountName+"\nBalance: "+getBalance()+"\nAccount Id: "+getId()+"\nDate created: "+dateCreated+"\nYour overdraft limit: "+overDraftLimit;
        }
        return "Balance: "+getBalance()+"\nAccount Id: "+getId()+"\nDate created: "+dateCreated+"\nYour overdraft limit: "+overDraftLimit;
    }
}
