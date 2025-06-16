package org.pattern_learener.structural.flyweight;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Фабрика легковесов управляет созданием и повторным использованием легковесов.
 * Фабрика получает запросы, в которых указано желаемое состояние легковеса.
 * Если легковес с таким состоянием уже создан, фабрика сразу его возвращает, а если нет — создаёт новый объект.
 */
public class TreeFactory {

    static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, Color color, String otherTreeData) {
        TreeType result = treeTypes.get(name);
        if (result == null) {
            result = new TreeType(name, color, otherTreeData);
            treeTypes.put(name, result);
        }
        return result;
    }

}
