package org.pattern_learener.structural.composite;

public class SimpleFigure implements Figure {

    private int x;
    private int y;

    public SimpleFigure() {
    }

    public SimpleFigure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("Drawing figure in " + x + " : " + y);
    }

    @Override
    public void move(int x, int y) {
        System.out.println("Moving figure in " + x + " : " + y + " from " + this.x + " : " + this.y);
        this.x = x;
        this.y = y;
    }
}
