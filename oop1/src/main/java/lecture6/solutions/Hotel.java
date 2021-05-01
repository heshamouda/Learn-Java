package lecture6.solutions;

public class Hotel {
    int floors;
    int roomsPerFloor;
    int occupancy;

    public int getRooms() {
        return floors * roomsPerFloor;
    }

    public void checkin() {
        occupancy++;
    }

    public void checkout() {
        occupancy--;
    }

    public void printInfo() {
        System.out.println("Rooms " + getRooms() + " #Guests " + occupancy);
    }

}
