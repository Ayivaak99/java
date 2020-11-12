package main.java.tutorials.masterclass.inheritance;

public class Car extends Vehicle {
    private int noOfDoors;
    private String gearType; // Automatic or manual
    private String bodyStyle; // Sedan, SUV, Compact, Sport etc
    private boolean switchAC;

    public Car() {
        this(0, "Unknown", "Unknown");
    }
    public Car(int noOfDoors, String gearType, String bodyStyle) {
        this("Unknown", 0, 0, noOfDoors, gearType, bodyStyle);
    }

    public Car(String type, int weight, int seatingCapacity, int noOfDoors, String gearType, String bodyStyle) {
        super(type, weight, seatingCapacity);
        this.noOfDoors = noOfDoors;
        this.gearType = gearType;
        this.bodyStyle = bodyStyle;
    }

    @Override
    public void move(int speed) {
        System.out.println("Car.move() @ " + speed + " kmph");
        super.move(speed);
    }

    @Override
    public void steer(String direction) {
        System.out.println("Car.steer() in " + direction.toUpperCase() + " direction");
        super.steer(direction);
    }

    public void changeGear(int gear, int speed) {
        System.out.println("Car.changeGear() to gear " + gear);
        move(speed);
    }

    public void toggleAC(boolean bool) {
        this.switchAC = bool;
        String state = this.switchAC? "ON" : "OFF";
        System.out.println("Car.toggleAC() " + state);
    }

    public int getNoOfDoors() {
        return noOfDoors;
    }

    public void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }

    public String getGearType() {
        return gearType;
    }

    public void setGearType(String gearType) {
        this.gearType = gearType;
    }

    public String getBodyStyle() {
        return bodyStyle;
    }

    public void setBodyStyle(String bodyStyle) {
        this.bodyStyle = bodyStyle;
    }
}
