package org.pattern_learener.structural.flyweight;

import java.awt.*;

/**
 * Легковес содержит состояние, которое повторялось во множестве первоначальных объектов. Один и тот же легковес можно использовать в связке со множеством контекстов.
 * Состояние, которое хранится здесь, называется внутренним, а то, которое он получает извне — внешним.
 */
public class TreeType {

    private final String name;
    private final Color color;
    private final String otherTreeData;

    public TreeType(String name, Color color, String otherTreeData) {
        this.name = name;
        this.color = color;
        this.otherTreeData = otherTreeData;
    }

    public void draw(Graphics g, int x, int y) {
        g.setColor(Color.BLACK);
        g.fillRect(x - 1, y, 3, 5);
        g.setColor(color);
        g.fillOval(x - 5, y - 10, 10, 10);
    }

}
