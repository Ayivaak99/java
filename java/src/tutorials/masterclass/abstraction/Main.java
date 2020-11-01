package tutorials.masterclass.abstraction;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();

        Puma puma = new Puma("Tommy");
        puma.breathe();
        puma.eat();
        puma.scratch();

        Lion lion = new Lion("Mufasa");
        lion.scratch();
    }
}
