package org.pattern_learener.creational.abstract_factory;

/**
 * Суть паттерна - порождающий паттерн проектирования, который позволяет создавать семейства связанных объектов, не привязываясь к конкретным классам создаваемых объектов.<p>
 * Применимость:<p>
 * - когда бизнес-логика программы должна работать с разными видами связанных друг с другом продуктов, не завися от конкретных классов продуктов;<p>
 * - когда в программе уже используется Фабричный метод, но очередные изменения предполагают введение новых типов продуктов;<p>
 * Преимущества и недостатки:<p>
 * + гарантирует сочетаемость создаваемых продуктов;<p>
 * + избавляет клиентский код от привязки к конкретным классам продуктов;<p>
 * + выделяет код производства продуктов в одно место, упрощая поддержку кода;<p>
 * + упрощает добавление новых продуктов в программу;<p>
 * + реализует принцип открытости/закрытости;<p>
 * - усложняет код программы из-за введения множества дополнительных классов;<p>
 * - требует наличия всех типов продуктов в каждой вариации
 */
public class AbstractFactoryPattern {

    public static void main(String[] args) {
        AbstractFactoryPattern example = new AbstractFactoryPattern();

        Application macApp = example.initDialog("mac");
        macApp.paint();

        Application winApp = example.initDialog("win");
        winApp.paint();
    }

    private Application initDialog(String platformName) {
        if ("win".equals(platformName)) {
            return new Application(new WinOSFactory());
        } else if ("mac".equals(platformName)) {
            return new Application(new MacOSFactory());
        }
        return new Application(new MacOSFactory());
    }

}
