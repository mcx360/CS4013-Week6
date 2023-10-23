package Lab4.Part2;

public class Staff extends Employee{
    private String title;

    public Staff(String person, String address, String phoneNumber, String emailAddress, String office, double salary, String title){
        super(person, address, phoneNumber, emailAddress, office, salary);
        this.title=title;
    }

    @Override
    public String toString(){
        return getPerson()+"\n"+getAddress()+"\n"+getPhoneNumber()+"\n"+getEmailAddress()+"\n"+getOffice()+"\n"+getSalary()+"\n"+title;
    }
}
