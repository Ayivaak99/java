package main.java.tutorials.masterclass.abstraction;

public abstract class Felidae extends Animal {
    public Felidae(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is purring");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out, repeat");
    }

    public abstract void scratch();
}
