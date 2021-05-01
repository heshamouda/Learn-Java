package lecture9.country;

public class CountryTester {
    public static void main(String[] args) {
        Country fantasia = new Country("Fantasia", 100000);
        Country monaco = new Monarchy("Monaco", 36371, "Lord Alber II");
        Country switzerland = new Republic("Switzerland", 8085300, 7);

        fantasia.print();
        monaco.print();
        switzerland.print();

        Country country= new Country("Fantasia", 0);
        if (country.getClass().equals(Country.class)){
            System.out.println("country is an instance of Country"); 	    // (1)
        }
        if (country instanceof Country){
            System.out.println("country is of type Country");  	            // (2)
        }
        country= new Monarchy("Monaco", 36371, "Lord Alber II");
        System.out.println(country.getClass());	                            // (3)
        if (country.getClass().equals(Country.class)){
            System.out.println("country is an instance of Country");	    // (4)
        }
        if (country instanceof Country){
            System.out.println("country is of type Country");	            // (5)
        }

    }
}
