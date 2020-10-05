package labSheet6.exercise1;

public class Person {
    private String firstName;
    private String lastName;

    public Person(){
        this("not supplied","not supplied");
    }
    public Person(String firstName,String lastName){
        setName(firstName,lastName);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
    public void setName(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
