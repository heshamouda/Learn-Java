package lecture10.solution.items;

public class Store {

    public static void main(String[] args) {
        Item[] cart = new Item[31];
        fillCart(cart);
        // Print information on the cart
        for (int i = 0; i < 31; i++) {
            cart[i].getInfo();
        }
        // Compute the volume of all furnitures.
        double vol = 0;
        for (Item item : cart) {
            if (item instanceof Furniture) {
                vol += ((Furniture) item).getVolume();        // We have to add an explicit typecast here
                // The abstract Item class does not define "getVolume"
            }
        }
        System.out.println("You have to transport " + (vol / 1000000) + " m^3");

        // Compute how much furniture is made of wood. For this use the method contains("Wood") from the String class
        int woodFurniture = 0;
        for (Item item : cart) {
            if (item instanceof Furniture) {
                if (((Furniture) item).getMaterial().contains("Wood")) {
                    woodFurniture++;
                }
            }
        }
        System.out.println("You have " + woodFurniture + " wooden furniture in your cart.");
        // Search the array for a Book with the title "The Book"
        for (Item item : cart) {
            if (item instanceof Book) {
                if (((Book) item).getTitle().compareTo("The Book") == 0) {
                    System.out.println("I have found a book with the Title 'The Book'");
                }
            }
        }

        Antique[] antiqueItems = new Antique[cart.length];
        int aCounter = 0;

        for (Item item : cart) {
            if (item instanceof Antique) {
                antiqueItems[aCounter++] = (Antique) item;
            }
        }
        // Printing the Epoques
        for (int i = 0; i < antiqueItems.length; i++) {
            if (antiqueItems[i] != null) {
                System.out.println(antiqueItems[i].getEpoque());
            }
        }

    }

    public static void fillCart(Item[] cart) {
        for (int i = 0; i < 5; i++) {
            cart[i] = new Table(100 + Math.random() * 100, 50 + Math.random() * 50, "Wood", 1000 + Math.random() * 1000);
        }
        for (int i = 5; i < 10; i++) {
            cart[i] = new Table(100 + Math.random() * 100, 50 + Math.random() * 50, "Glass", 500 + Math.random() * 1500);
        }
        for (int i = 10; i < 15; i++) {
            cart[i] = new Wardrobe(100 + Math.random() * 100, 35 + Math.random() * 35, 50 + Math.random() * 150, "massive Wood", 1000 + Math
                    .random() * 1000);
        }
        for (int i = 15; i < 20; i++) {
            cart[i] = new Wardrobe(100 + Math.random() * 100, 35 + Math.random() * 35, 50 + Math.random() * 150, "Furnier", 500 + Math
                    .random() * 1000);
        }
        Author a = new Author("Muller");

        for (int i = 20; i < 25; i++) {
            cart[i] = new AntiqueWardrobe("Gothic", getRandom(100, 100),
                    getRandom(35, 35), getRandom(50, 150), getRandom(1000, 1000));
        }
        for (int i = 25; i < 30; i++) {
            cart[i] = new AntiqueTable("Art Nouveau", getRandom(100, 100),
                    getRandom(35, 35), getRandom(80, 110), getRandom(500,1000));
        }
        cart[30] = new AntiqueBook("Barock", a, "old Book", "Barock", 20.2);
    }

    private static int getRandom(int min, int max) {
        return min + (int) (Math.random() * max);

    }

}
