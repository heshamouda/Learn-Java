package lecture8.hotel;

public class Room {
	private Person[] guests;
	private boolean full;
	
	public Room(int g){
		guests = new Person[g];
		full =false;
	}
	
	public void addGuest(Person person){
		boolean set= false;
		for (int i = 0; i< guests.length; i++){
			// at this position there is no guest yet (bed is free)
			// and the person does not have a bed yet
			if (guests[i]==null && !set){
				guests[i]=person;
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
