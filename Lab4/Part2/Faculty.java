package Lab4.Part2;

public class Faculty extends Employee{
    private String officeHours;
    private String rank;

    public Faculty(String person, String address, String phoneNumber, String emailaddress, String office, int salary,String officeHours, String rank){
        super(person, address, phoneNumber, emailaddress, office, salary);
        this.officeHours=officeHours;
        this.rank=rank;
    }

    @Override
    public String toString(){
        return getPerson()+"\n"+getAddress()+"\n"+getPhoneNumber()+"\n"+getEmailAddress()+"\n"+getOffice()+"\n"+getSalary()+"\n"+officeHours+"\n"+rank;
    }
}
