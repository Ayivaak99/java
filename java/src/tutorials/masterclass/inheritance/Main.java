package tutorials.masterclass.inheritance;

public class Main {
    public static void main(String[] args) {
    Animal animal = new Animal("Andy",1,1,14,30);
    Fish fish = new Fish("Jill",5,8,2,2,4);
    Dog dog = new Dog("Tommy", 6,34,2,4,1,
            34,"Golden");
    System.out.println(dog.getCoat());
    dog.move(6);
    dog.eat();
    dog.walk();
    dog.run();
    dog.move(4);

    fish.eat();
    fish.move(7);
    }
}
