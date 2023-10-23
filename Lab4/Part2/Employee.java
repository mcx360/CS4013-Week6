package Lab4.Part2;

public class Employee extends Person{
    private String office;
    private double salary;

    public Employee(String person, String address, String phoneNumber, String emailAddress, String office, double salary){
        super(person,address,phoneNumber,emailAddress);
        this.office=office;
        this.salary=salary;
    }

    public String getOffice(){
        return office;
    }

    public double getSalary(){
        return salary;
    }

    @Override
    public String toString(){
        return getPerson()+"\n"+getAddress()+"\n"+getPhoneNumber()+"\n"+getEmailAddress()+"\n"+office+"\n"+salary;
    }
}
