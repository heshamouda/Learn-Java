package lecture6;

public class Test {
    public static void main(String[] args) {
        // Example with primitives
        int value1 = 8;                 // Store 8 somewhere in memory (under name `value1`)
        int value2 = 10;                // Store 10 somewhere in memory (under name `value2`)

        value2 = value1;                // Copy the 8 where we currently have the 10
        System.out.println(value2);     // Prints 8
        value1 = 10;                    // Change the 8 that is accessible at `value1` into 10
        System.out.println(value1);     // Prints 10
        System.out.println(value2);     // Prints 8

        // Example with Classes and Objects
        Country c1 = new Country();     // Create a reference
        c1.name = "Switzerland";
        Country c2 = new Country();     // Create a second reference
        c2.name = "Germany";

        System.out.println(c1.name);    // Prints Switzerland
        System.out.println(c2.name);    // Prints Germany

        c1 = c2;                        // Set them both to the same "Reference"
        System.out.println(c1.name);    // Prints Germany
        c2.name = "Italy";              // Set the name of the referenced object to "Italy"
        System.out.println(c1.name);    // Prints "Italy"
        System.out.println(c2.name);    // Prints "Italy"
    }
}
