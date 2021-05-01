package lecture7.solutions;

import java.util.Objects;

public class Hotel {
    private int floors;
    private int roomsPerFloor;
    private int occupancy;

    public Hotel(int floors, int roomsPerFloor) {
        this.floors = floors;
        this.roomsPerFloor = roomsPerFloor;
        this.occupancy = 0;
    }

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

    public boolean equals(Hotel hotel) {
        if (this == hotel) return true;
        if (hotel == null) return false;
        return floors == hotel.floors &&
                roomsPerFloor == hotel.roomsPerFloor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(floors, roomsPerFloor);
    }
}