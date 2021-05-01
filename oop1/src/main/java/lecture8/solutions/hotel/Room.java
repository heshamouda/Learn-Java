package lecture8.solutions.hotel;

public class Room {
	private Person[] guests;
	private boolean full;
	
	public Room(int g){
		guests = new Person[g];
		full =false;
	}
	
	public void addGuest(Person g){
		boolean set= false;
		for (int i = 0; i< guests.length; i++){
			if (guests[i]==null && !set){
				guests[i]=g;
				set= true;
			}
		} 
		full = true;
	}
	
	public Person[] getGuests(){
		return guests;
	}
	
	public void checkout(){
		for (int i = 0; i< guests.length; i++){
			guests[i]=null;
		}
		full =false;
	}
	
	public boolean isFull(){
		return full;
	}
}
