package lecture6.solutions;

public class HealthResort {
    public static void main(String[] args) {
        Hotel hotel1= new Hotel();
        Hotel hotel2= new Hotel();
        Hotel hotel3= new Hotel();

        hotel1.floors= 3;
        hotel1.roomsPerFloor= 5;

        hotel2.floors= 2;
        hotel2.roomsPerFloor= 10;

        hotel3.floors= 20;
        hotel3.roomsPerFloor= 5;

        int zufall= (int) (Math.random()*10);
        for (int i=0; i<zufall; i++){
            hotel1.checkin();
        }

        hotel1.printInfo();
        hotel2.printInfo();
        hotel3.printInfo();

    }
}
