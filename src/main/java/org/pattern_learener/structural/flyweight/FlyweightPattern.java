package org.pattern_learener.structural.flyweight;

import javax.swing.*;
import java.awt.*;

/**
 * Суть паттерна - это структурный паттерн проектирования, который позволяет вместить бóльшее количество объектов в отведённую оперативную память.
 * Легковес экономит память, разделяя общее состояние объектов между собой, вместо хранения одинаковых данных в каждом объекте.<p>
 * Применимость:<p>
 * - когда не хватает оперативной памяти для поддержки всех нужных объектов;<p>
 * Преимущества и недостатки:<p>
 * + экономит оперативную память;<p>
 * - расходует процессорное время на поиск/вычисление контекста;<p>
 * - усложняет код программы из-за введения множества дополнительных классов;<p>
 * Реализация:<p>
 * 1. Разделите поля класса, который станет легковесом, на две части:<p>
 * - внутреннее состояние: значения этих полей одинаковы для большого числа объектов;<p>
 * - внешнее состояние (контекст): значения полей уникальны для каждого объекта.<p>
 * 2. Оставьте поля внутреннего состояния в классе, но убедитесь, что их значения неизменяемы.
 * Эти поля должны инициализироваться только через конструктор.<p>
 * 3. Превратите поля внешнего состояния в параметры методов, где эти поля использовались. Затем удалите поля из класса.<p>
 * 4. Создайте фабрику, которая будет кешировать и повторно отдавать уже созданные объекты.
 * Клиент должен запрашивать из этой фабрики легковеса с определённым внутренним состоянием, а не создавать его напрямую.<p>
 * 5. Клиент должен хранить или вычислять значения внешнего состояния (контекст) и передавать его в методы объекта легковеса.
 */
public class FlyweightPattern {

    static int CANVAS_SIZE = 500;
    static int TREES_TO_DRAW = 1000000;
    static int TREE_TYPES = 2;

    public static void main(String[] args) {
        Forest forest = new Forest();
        for (int i = 0; i < Math.floor(TREES_TO_DRAW / TREE_TYPES); i++) {
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Summer Oak", Color.GREEN, "Oak texture stub");
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Autumn Oak", Color.ORANGE, "Autumn Oak texture stub");
        }
        forest.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        forest.setSize(CANVAS_SIZE, CANVAS_SIZE);
        forest.setResizable(false);
        forest.setVisible(true);

        System.out.println(TREES_TO_DRAW + " trees drawn");
        System.out.println("---------------------");
        System.out.println("Memory usage:");
        System.out.println("Tree size (8 bytes) * " + TREES_TO_DRAW);
        System.out.println("+ TreeTypes size (~30 bytes) * " + TREE_TYPES + "");
        System.out.println("---------------------");
        System.out.println("Total: " + ((TREES_TO_DRAW * 8 + TREE_TYPES * 30) / 1024 / 1024) +
                "MB (instead of " + ((TREES_TO_DRAW * 38) / 1024 / 1024) + "MB)");
    }

    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

}
