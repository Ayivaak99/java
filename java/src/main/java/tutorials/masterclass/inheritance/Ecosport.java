package main.java.tutorials.masterclass.inheritance;

public class Ecosport extends Car{
    private double cost;
    private int mileage;
    private String variant; // Petrol or Diesel
    private String colour;

    public Ecosport() {
        this(0, 0, "Unknown", "Unknown");
    }
    public Ecosport(double cost, int mileage, String variant, String colour) {
        this(0, "Unknown", "Unknown", cost, mileage, variant, colour);
    }

    public Ecosport(int noOfDoors, String gearType, String bodyStyle, double cost, int mileage, String variant,
                    String colour) {
        super(noOfDoors, gearType, bodyStyle);
        this.cost = cost;
        this.mileage = mileage;
        this.variant = variant;
        this.colour = colour;
    }

    public Ecosport(String type, int weight, int seatingCapacity, int noOfDoors, String gearType, String bodyStyle,
                    double cost, int mileage, String variant, String colour) {
        super(type, weight, seatingCapacity, noOfDoors, gearType, bodyStyle);
        this.cost = cost;
        this.mileage = mileage;
        this.variant = variant;
        this.colour = colour;
    }

    @Override
    public void move(int speed) {
        System.out.println("Ecosport.move() @ " + speed + " kmph");
        super.move(speed);
    }

    @Override
    public void steer(String direction) {
        System.out.println("Ecosport.steer() in " + direction.toUpperCase() + " direction");
        super.steer(direction);
    }

    @Override
    public void changeGear(int gear, int speed) {
        System.out.println("Car.changeGear() to gear " + gear);
        super.changeGear(gear, speed);
    }

    @Override
    public void toggleAC(boolean bool) {
        super.toggleAC(bool);
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getVariant() {
        return variant;
    }

    public void setVariant(String variant) {
        this.variant = variant;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
