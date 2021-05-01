package lecture8.hotel;

public class HotelManagement {

	public static void main(String[] args) {
		Hotel h= new Hotel(3,4);
		Hotel h2= new Hotel(5,3);
		Person p1= new Person( 34);
		Person p2= new Person( 35);
		Person p3= new Person( 16);
		Person p4= new Person( 21);
		Person p5= new Person( 55);
		Person p6= new Person( 63);
		Person p7= new Person( 70);
		Person p8= new Person( 18);
		
		int z1= h.checkin(p1);
		System.out.println(z1);
		int z2= h.checkin(p2, p3);
		h.checkout(z1);
		
	}

}
