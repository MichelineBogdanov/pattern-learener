package org.pattern_learener.behavioral.visitor;

public interface Shape {

    void move(int x, int y);

    void draw();

    String accept(Visitor visitor);

}
