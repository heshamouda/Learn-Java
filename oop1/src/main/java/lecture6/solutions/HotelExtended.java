package lecture6.solutions;

public class HotelExtended {
    int floors;
    int roomsPerFloor;
    int occupancy;

    public int getRooms() {
        return floors * roomsPerFloor;
    }

    public boolean checkin() {
        if (occupancy < getRooms()) {
            occupancy++;
            return true;
        } else {
            return false;
        }
    }

    public boolean checkout() {
        if (occupancy == 0) {
            return false;
        } else if (occupancy > 0) {
            occupancy--;
            return true;
        }
        return false; //failsave if occupancy would get a negative value
    }

    public void printInfo() {
        System.out.println("Rooms " + getRooms() + " #Guests " + occupancy);
    }
}
