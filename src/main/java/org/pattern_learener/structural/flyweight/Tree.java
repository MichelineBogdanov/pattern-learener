package org.pattern_learener.structural.flyweight;

import java.awt.*;

/**
 * Контекст содержит «внешнюю» часть состояния, уникальную для каждого объекта.
 * Контекст связан с одним из объектов-легковесов, хранящих оставшееся состояние.
 */
public class Tree {

    private final int x;
    private final int y;
    private final TreeType type;

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Graphics g) {
        type.draw(g, x, y);
    }

}
