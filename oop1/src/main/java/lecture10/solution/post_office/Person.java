package lecture10.solution.post_office;

public class Person {

    private String firstName;
    private String lastName;
    private int birthYear;
    private int birthMonth;
    private int birthDay;
    private Address address;

    public Person(String firstName, String lastName, int birthYear, int birthMonth, int birthDay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
    }

    public void receiveItem(Item item){
        System.out.println("Receiving...");
        System.out.println(item.toString());
    }

    @Override
    public String toString() {
        return getFirstName() + " " + getLastName() + "(" + birthYear + "-" + birthMonth + "-" + birthDay + ")";
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
