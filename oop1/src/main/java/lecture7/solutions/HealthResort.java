package lecture7.solutions;


public class HealthResort {
    public static void main(String[] args) {
        Hotel hotel1 = new Hotel(3, 5);
        Hotel hotel2 = new Hotel(2, 10);
        Hotel hotel3 = new Hotel(20, 5);

        int zufall = (int) (Math.random() * 10);
        for (int i = 0; i < zufall; i++) {
            hotel1.checkin();
        }

        hotel1.printInfo();
        hotel2.printInfo();
        hotel3.printInfo();

    }
}
