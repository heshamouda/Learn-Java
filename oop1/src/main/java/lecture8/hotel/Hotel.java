package lecture8.hotel;

public class Hotel {
    private Room[] rooms;
    private String name;
    private int amountSingle;
    private int amountDouble;

    public Hotel(int single, int dbl) {
        rooms = new Room[single + dbl];
        for (int i = 0; i < single; i++) {
            rooms[i] = new Room(1);
        }
        for (int i = single; i < single + dbl; i++) {
            rooms[i] = new Room(2);
        }
        amountSingle = single;
        amountDouble = dbl;
    }

    public int checkin(Person p1, Person p2) {
        int nummer = -1;
        boolean set = false;
        for (int i = amountSingle; i < amountSingle + amountDouble; i++) {
            // search for a room that is not full
            // and the person that do not have a room yet
            if (!rooms[i].isFull() && !set) {
                rooms[i].addGuest(p1);
                rooms[i].addGuest(p2);
                set = true;
                nummer = i;
                // oder return i;
            }
        }
        return nummer;
    }

    public int checkin(Person p1) {
        int nummer = -1;
        boolean set = false;
        for (int i = 0; i < amountSingle; i++) {
            // Search for a room that is not full yet
            // and the person has not been assigned a room
            if (!rooms[i].isFull() && !set) {
                rooms[i].addGuest(p1);
                nummer = i;
                set = true;
            }
        }
        return nummer;
    }

    public void checkout(int roomNumber) {
        rooms[roomNumber].checkout();
    }

    /* Write here a method that computes how many people older than 50 are in the hotel
    //public int getPeopleOver50(){}

    /* Write a method here that computes the average age of hotel guests
     */
    //public double getAvergaeAge(){}

}
