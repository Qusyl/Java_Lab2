package Pckg;

public class User {
    private String ID;
    private String FirstName;
    private String LastName;
    private int age;
    private String country;
    public User(String ID_, String FirstName_, String LastName_,int age_,String country_ )
    {
        this.ID = ID_;
        this.FirstName = FirstName_;
        this.LastName = LastName_;
        this.age = age_;
        this.country = country_;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void Print()
    {
        System.out.println("-----------------------------");
        System.out.println("* FistName : " + FirstName);
        System.out.println("* LastName : " + LastName);
        System.out.println("* ID : " + ID);
        System.out.println("* Age : " + age);
        System.out.println("* Country : " + country);
    }


}
