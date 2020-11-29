package main.tutorials.masterclass.abstraction;

public class Puma extends Felidae {
    public Puma(String name) {
        super(name);
    }

    @Override
    public void scratch() {
        System.out.println("Scratch, scratch, scratch!!");
    }
}
