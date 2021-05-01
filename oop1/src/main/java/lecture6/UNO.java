package lecture6;

public class UNO {
    public static void main(String[] args) {
        Country switzerland = null;
        switzerland = new Country();
        switzerland.name = "Switzerland";
        switzerland.inhabitants = 7997000;
        System.out.println("Inhabitants of Switzerland: " + switzerland.inhabitants);
        switzerland.immigrate(200);
        switzerland.emigrate(300);
        System.out.println("Inhabitants of Switzerland: " + switzerland.inhabitants);

        Country germany = new Country();
        germany.name = "Germany";
        germany.inhabitants = 40000;
        germany.immigrate(4000);
        System.out.println("Inhabitants of Germany: " + germany.inhabitants);
        System.out.println("Inhabitants of Switzerland: " + switzerland.inhabitants);
    }
}
