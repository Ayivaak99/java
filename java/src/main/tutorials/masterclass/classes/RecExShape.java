package main.tutorials.masterclass.classes;

import java.awt.*;

public class RecExShape extends Shape {
    private int width;
    private int height;

    public RecExShape(int x, int y) {
        this(x, y, 0, 0);
    }
    public RecExShape(int x, int y, int width, int height) {
        super(x,y);
        this.width = width;
        this.height = height;
    }
}
