package main.java.tutorials.masterclass.inheritance;

public class Vehicle {
    private String type; // Car, motorcycle, truck, train, bicycle etc
    private int weight;
    private int seatingCapacity;

    public Vehicle() {
        this("Unknown", 0, 0);
    }

    public Vehicle(String type, int weight, int seatingCapacity) {
        this.type = type;
        this.seatingCapacity = seatingCapacity;
        this.weight = weight;
    }

    public void move(int speed) {
        System.out.println("Vehicle.move() @ " + speed + " kmph");
    }

    public void steer(String direction) {
        System.out.println("Vehicle.steer() in " + direction.toUpperCase() + " direction");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }
}
