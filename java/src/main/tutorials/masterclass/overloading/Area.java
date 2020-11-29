package main.tutorials.masterclass.overloading;

public class Area {
    public static int area(int side) {
        return side*side;
    }
    public static int area(int length, int breadth) {
        return length*breadth;
    }
    public static float area(double side1, double side2, double side3) {
        double halfPerimeter = (side1+side2+side3)/2;
        double intermediate = halfPerimeter*(halfPerimeter-side1)*(halfPerimeter-side2)*(halfPerimeter-side3);
        return (float) Math.sqrt(intermediate);
    }
    public static void main(String[] args) {
        System.out.println("Area = " + area(2));
        System.out.println("Area = " + area(5,4));
        System.out.println("Area = " + area(5,12.5, 13.68));
    }
}