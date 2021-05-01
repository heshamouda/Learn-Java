package lecture8.solutions.hotel;

public class HotelManagement {

    public static void main(String[] args) {
        Hotel h = new Hotel(3, 4, 3);
        Person p1 = new Person(34);
        Person p2 = new Person(35);
        Person p3 = new Person(16);
        Person p4 = new Person(21);
        Person p5 = new Person(55);
        Person p6 = new Person(63);

        int z1 = h.checkin(p1);
        int z2 = h.checkin(p2, p3);
        int z3 = h.checkin(p4, p5, p6);
        h.checkout(z1);
        System.out.println("People over 50 " + h.getPeopleOver50());
        System.out.println("Age average " + h.getAvergaeAge());
        System.out.println("Amount free single rooms " + h.getFreeRooms(1));
        System.out.println("Amount free double rooms " + h.getFreeRooms(2));
        System.out.println("Amount free triple rooms " + h.getFreeRooms(3));
    }

}
