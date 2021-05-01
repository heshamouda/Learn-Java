package lecture9.vehicles;

public class VehicleTester {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("Vehicle1", 0);
        Bicycle bike = new Bicycle("My Bike", 48);
        Car car = new Car("Ferrari", 430, 2);
        Cabriolet cabrio = new Cabriolet("My Cabriolet", 150, 4);
        v.print();          //Print "This is a vehicle"
        bike.print();       //Print "This is a bicycle"
        car.print();        //Print "This is a car"
        cabrio.print();     //Print "This is a cabriolet"

        System.out.println("-------------------------------------");

        Vehicle[] vehicles= new Vehicle[4];     // Create an array of Vehicle
        vehicles [0]= v;
        vehicles [1]= bike;
        vehicles [2]= car;
        vehicles [3]= cabrio;
        for (int i=0; i< vehicles.length; i++){
            vehicles[i].print();        // What will be printed here??
        }

        // Task 3
        // v=bike; // This works
        //bike = v; // This does not work; We can not treat a Vehicle object as if it would be a Bicycle object.
        //car=bike; // This does not work; We can not treat a Bike object as if it would be a Car object.
        //cabrio= car; //This does not work; We can not treat a Car object as if it would be a Cabriolet object

        // Task
        Vehicle v1= new Vehicle("Vehicle1", 0);
        processVehicle(v1);  // Print "I received ... vehicle"
                            // Print "I am a vehicle"

        Car c= new Car("Ferrari",430,2);
        processVehicle(c); // Print "I received .. car"
                            //Print "I am a car"

        Vehicle v2= c;
        processVehicle(v2); // Print "I received ... vehicle"
                            // Print "I am a car" // "I am a vehicle"
    }

    public static void processVehicle(Vehicle v){
        System.out.println("I received the following vehicle");
        v.print();
    }

    public static void processVehicle(Car c){
        System.out.println("I received the following car");
        c.print();
    }
}
