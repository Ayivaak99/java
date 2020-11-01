package tutorials.masterclass.inheritance;

public class Main {
    public static void main(String[] args) {
//    Animal animal = new Animal("Andy",1,1,14,30);
//    Fish fish = new Fish("Jill",5,8,2,2,4);
//    Dog dog = new Dog("Tommy", 6,34,2,4,1,
//            34,"Golden");
//    System.out.println(dog.getCoat());
//    dog.move(6);
//    dog.eat();
//    dog.walk();
//    dog.run();
//    dog.move(4);
//    fish.eat();
//    fish.move(7);

//    Vehicle v = new Vehicle();
//    v.move(59);
//    v.steer("left");
//    Car c = new Car(4, "Automatic", "SUV");
//    c.toggleAC(true);
//    c.changeGear(5, 60);
//
//    Ecosport e = new Ecosport(890000, 28, "Diesel", "Black");
//    System.out.println(e.getType());
//    System.out.println(e.getCost());
//    e.move(40);
//    e.toggleAC(false);

        Outlander out = new Outlander(48);
        out.move(10, 20);
        System.out.println();
        out.accelerate(15);
        System.out.println();
        out.accelerate(20);
        System.out.println();
        out.stop();
        System.out.println(out.getCurrentVelocity());
        out.changeVelocity(20, 50);
    }
}
