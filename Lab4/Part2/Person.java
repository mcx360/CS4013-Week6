package Lab4.Part2;

public class Person {
    private String person;
    private String address;
    private String phoneNumber;
    private String emailAddress;

    public Person(String person, String address, String phoneNumber, String emailAddress){
        this.person=person;
        this.address=address;
        this.phoneNumber=phoneNumber;
        this.emailAddress=emailAddress;
    }

    public String getPerson(){
        return person;
    }

    public String getAddress(){
        return address;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public String getEmailAddress(){
        return emailAddress;
    }

    public String toString(){
        return person+"\n"+address+"\n"+phoneNumber+"\n"+emailAddress;
    }


}
