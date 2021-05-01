package lecture6.solutions;

public class CountryTester {
    public static void main(String[] args) {
//        Country switzerland = null;
//        switzerland = new Country();
//        switzerland.name = "Switzerland";
//        switzerland.immigrate(300);
//        switzerland.emigrate(200);
//        Country germany = new Country();
//        germany.name = "Germany";
//        germany.immigrate(1200);
//        germany.emigrate(920);
//
//        switzerland.print();
//        germany.print();

        //Exercise 3
        Country country1 = new Country();
        country1.name = "Switzerland";
        country1.immigrate(300);
        country1.emigrate(200);
        Country country2 = country1;
        country2.name = "Deutschland";
        country2.immigrate(1200);
        country2.emigrate(920);

        country1.print();
        country2.print();

    }
}
