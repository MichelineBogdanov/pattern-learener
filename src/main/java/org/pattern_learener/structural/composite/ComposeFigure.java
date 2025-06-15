package org.pattern_learener.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class ComposeFigure implements Figure {

    private List<SimpleFigure> children = new ArrayList<>();

    public ComposeFigure() {
    }

    public ComposeFigure(List<SimpleFigure> children) {
        this.children = children;
    }

    public void addChild(SimpleFigure figure) {
        children.add(figure);
    }

    public void removeChild(SimpleFigure figure) {
        children.remove(figure);
    }


    @Override
    public void draw() {
        children.forEach(SimpleFigure::draw);
    }

    @Override
    public void move(int x, int y) {
        children.forEach(figure -> figure.move(x, y));
    }
}
