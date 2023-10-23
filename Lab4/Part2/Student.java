package Lab4.Part2;

public class Student extends Person{
    private int yearOfStudy;
    private String programmeOfStudy;

    public Student(String person, String address, String phoneNumber, String emailAddress, int yearOfStudy, String programmeOfStudy){
        super(person, address, phoneNumber, emailAddress);
        this.yearOfStudy=yearOfStudy;
        this.programmeOfStudy=programmeOfStudy;
    }

    public int getYearOfStudy(){
        return yearOfStudy;
    }

    public String getProgrammeOfStudy(){
        return programmeOfStudy;
    }

    @Override
    public String toString(){
        return getPerson()+"\n"+getAddress()+"\n"+getPhoneNumber()+"\n"+getEmailAddress()+"\n"+yearOfStudy+"\n"+programmeOfStudy;
    }
}
