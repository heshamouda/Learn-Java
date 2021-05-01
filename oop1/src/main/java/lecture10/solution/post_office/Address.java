package lecture10.solution.post_office;

public class Address {
    private String street;
    private int houseNumber;
    private int zipCode;
    private String city;
    private String country;

    public Address(String street, int houseNumber, int zipCode, String city, String country) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.zipCode = zipCode;
        this.city = city;
        this.country = country;
    }

    @Override
    public String toString() {
        return getStreet() + " " + getHouseNumber() + "\n\r" +
                getZipCode() + " " + getCity() + "\n\r" +
                getCountry();
    }

    public String getStreet() {
        return street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public int getZipCode() {
        return zipCode;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }
}
