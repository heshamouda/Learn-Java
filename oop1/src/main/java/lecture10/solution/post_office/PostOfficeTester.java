package lecture10.solution.post_office;

public class PostOfficeTester {
    public static void main(String[] args) {
        Person p1 = new Person("Hans-Peter", "Peter-Hans", 1952, 1, 17);
        Address a1 = new Address("Steinackerstrasse", 5, 5210, "Windisch", "Schweiz");
        p1.setAddress(a1);

        Person p2 = new Person("Anne-Marie", "Schibli", 1936, 5, 9);
        Address a2 = new Address("Sihlquai", 54, 8001, "Zürich", "Schweiz");
        p2.setAddress(a2);

        Person p3 = new Person("Josef", "Kappeler", 1964, 11, 27);
        Address a3 = new Address("Holzweg", 8, 9100, "Herisau", "Schweiz");
        p3.setAddress(a3);
        PostOffice postOffice = new PostOffice(10);
        Letter letter = new Letter(p1, p2, "A5", "Hallo Anne-Marie, wie geht es dir?");
        if (postOffice.addItem(letter)) {
            System.out.println("Added new item:");
            System.out.println(letter.toString());
        }
        System.out.println();
        Parcel parcel = new Parcel(p3, p1, 10, 32, 10, 350, "Vase");
        if (postOffice.addItem(parcel)) {
            System.out.println("Added new item:");
            System.out.println(parcel.toString());
        }
        System.out.println();

        postOffice.sendItems();
    }

}
