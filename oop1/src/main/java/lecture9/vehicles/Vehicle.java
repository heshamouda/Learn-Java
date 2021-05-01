package lecture9.vehicles;


import java.util.Objects;

public class Vehicle {
    private double speed;
    private String name;

    public Vehicle(String n, double s){
        this.name = n;
        this.speed = s;
    }

    public void print(){
        System.out.println("This is a vehicle");
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Vehicle)) return false;
        Vehicle vehicle = (Vehicle) o;
        return this.speed == vehicle.getSpeed() && this.name.equals(vehicle.getName());
    }

    @Override
    public String toString(){
        return "This is a vehicle";
    }

}
