package se.Lexicon;

public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private String email;

    public Person(int id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }


    //methods

    @Override
    public String toString() {
        return "Person:" + " ID:" + id + " FirstName: " + firstName + " LastName: " + lastName + " email: " + email
                ;
    }


    //set and get

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null) throw new RuntimeException("FirstName cannot be null!");
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null) throw new RuntimeException("LastName cannot be null!");
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null) throw new RuntimeException("Email cannot be null!");
        this.email = email;
    }

    public String getSummary() {
        return "ID:" + getId() + "  Name:" + getFirstName() + " " + getLastName() + " email:" + getEmail();
    }
}


