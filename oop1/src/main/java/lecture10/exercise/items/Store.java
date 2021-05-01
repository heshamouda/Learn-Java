package lecture10.exercise.items;

public class Store {

	public static void main(String[] args) {
		Item[] cart= new Item[22];
		//fillCart(cart);
		// Print information on the cart
		for (int i= 0; i<22; i++){
			cart[i].getInfo();
		}
		// Compute the volume of all furnitures.
		double vol=0;
		
		System.out.println("You have to transport "+(vol/1000000)+ " m^3");
		// Compute how much furniture is made of wood. For this use the method contains("Wood") from the String class



		// Search the array for a Book with the title "The Book"
	}

	// This method fills random items into the cart.
	// Uncomment this line once you have implemented all missing classes
	/*public static void fillCart(Item[] cart){
		for (int i=0; i<5; i++){
			cart[i]= new Table(100+Math.random()*100, 50+Math.random()*50, "Wood", 1000+Math.random()*1000);
		}
		for (int i=5; i<10; i++){
			cart[i]= new Table(100+Math.random()*100, 50+Math.random()*50, "Glass", 500+Math.random()*1500);
		}
		for (int i=10; i<15; i++){
			cart[i]= new Wardrobe(100+Math.random()*100, 35+Math.random()*35, 50+Math.random()*150, "massive Wood", 1000+Math.random()*1000);
		}
		for (int i=15; i<20; i++){
			cart[i]= new Wardrobe(100+Math.random()*100, 35+Math.random()*35, 50+Math.random()*150, "Furnier", 500+Math.random()*1000);
		}
		Author a= new Author("Muller");
		cart[20]= new Book(a, "The Book", "ABCDEFGHIJKLMNOP", 10.2);
		cart[21]= new Book(new Author("Muller"), "The Book 2", "abcdefghijklmnop", 12.2);
	}*/

}
