package lecture9.country;

public class UNO {
    public static void main(String[] args) {
        Country c = new Country();
        c.setInhabitants(40);
        c.setName("Switzerland");
        c.print();

        Monarchy monaco = new Monarchy();
        monaco.setInhabitants(40);      // inherited method
        monaco.setName("Monaco");       // inherited method
        monaco.setMonarch("Albert");    // own method
        monaco.print();                 // own method
    }
}
