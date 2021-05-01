package lecture7;

public class UNO {
    public static void main(String[] args) {
        Country switzerland = new Country(100000, "Switzerland");
        City zuerich = new City("Zuerich");
        switzerland.setName("Germany");

        System.out.println(switzerland.getName());
        System.out.println(switzerland.getInhabitants());
        System.out.println(zuerich.getName());
    }
}
