package main.tutorials.masterclass.inheritance;

public class Fish extends Animal {
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills,
                int eyes, int fins) {
        super(name,1,1, size, weight);
        this.eyes = eyes;
        this.fins = fins;
        this.gills = gills;
    }

    private void moveMuscles() {
        System.out.println("Fish.moveMuscles() called");
    }

    private void moveBackFin() {
        System.out.println("Fish.moveBackFin() called");
    }

    private void swim() {
        System.out.println("Fish.swim() called");
        moveMuscles();
        moveBackFin();
    }

    @Override
    public void move(int speed) {
        System.out.println("Fish.move() called");
        swim();
        super.move(speed);
    }
}
