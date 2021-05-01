package lecture8.solutions.hotel;

public class Hotel {
	private Room[] rooms;
	private String name;
	private int amountSingle;
	private int amountDouble;
	private int amountTriple;

	public Hotel(int single, int dbl, int triple) {
		rooms = new Room[single + dbl + triple];
		for (int i = 0; i < single; i++) {
			rooms[i] = new Room(1);
		}
		for (int i = single; i < single + dbl; i++) {
			rooms[i] = new Room(2);
		}
		for (int i = single + dbl; i < single + dbl + triple; i++) {
			rooms[i] = new Room(3);
		}
		amountSingle = single;
		amountDouble = dbl;
		amountTriple = triple;
	}

	public int checkin(Person p1, Person p2) {
		int nummer = -1;
		boolean set = false;
		for (int i = amountSingle; i < amountSingle + amountDouble; i++) {
			if (!rooms[i].isFull() && !set) {
				rooms[i].addGuest(p1);
				rooms[i].addGuest(p2);
				set = true;
				nummer = i;
			}
		}
		return nummer;
	}

	public int checkin(Person p1) {
		int nummer = -1;
		boolean set = false;
		for (int i = 0; i < amountSingle + amountDouble; i++) {
			if (!rooms[i].isFull() && !set) {
				rooms[i].addGuest(p1);
				nummer = i;
				set = true;
			}
		}
		return nummer;
	}

	public int checkin(Person p1, Person p2, Person p3) {
		int nummer = -1;
		boolean set = false;
		for (int i = amountSingle + amountDouble; i < amountSingle
				+ amountDouble + amountTriple; i++) {
			if (!rooms[i].isFull() && !set) {
				rooms[i].addGuest(p1);
				rooms[i].addGuest(p2);
				rooms[i].addGuest(p3);
				set = true;
				nummer = i;
			}
		}
		return nummer;
	}

	public void checkout(int zimmerNummer) {
		rooms[zimmerNummer].checkout();
	}

	/*
	 * Methode die die Anzahl der Zimmer angibt
	 */
	public int getFreeRooms(int amountBeds) {
		int anzahl = 0;
		for (int i = 0; i < rooms.length; i++) {
			if (amountBeds == rooms[i].getGuests().length
					&& !rooms[i].isFull()){
				anzahl++;
			}
			
		}
		return anzahl;
	}
	
	public int getPeopleOver50() {
		int amount = 0;
		for (int i = 0; i < rooms.length; i++) {
			Person[] gaeste = rooms[i].getGuests();
			for (int j = 0; j < gaeste.length; j++) {
				if (gaeste[j] != null && gaeste[j].getAge() > 50) {
					amount++;
				}
			}
		}
		return amount;
	}

	public double getAvergaeAge() {
		int anzahl = 0;
		double alter= 0;
		for (int i = 0; i < rooms.length; i++) {
			Person[] gaeste = rooms[i].getGuests();
			for (int j = 0; j < gaeste.length; j++) {
				if (gaeste[j] != null) {
					anzahl++;
					alter = alter+gaeste[j].getAge();
				}
			}
		}
		return alter/anzahl;
	}

}
