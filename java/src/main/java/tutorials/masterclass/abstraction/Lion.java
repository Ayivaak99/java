package main.java.tutorials.masterclass.abstraction;

public class Lion extends Felidae {
    public Lion(String name) {
        super(name);
    }

    @Override
    public void scratch() {
        System.out.println("Roar and scratch, scratch scratch!!");
    }
}
