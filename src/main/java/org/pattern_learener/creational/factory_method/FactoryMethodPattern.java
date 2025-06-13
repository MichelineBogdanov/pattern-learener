package org.pattern_learener.creational.factory_method;

/**
 * Суть паттерна - получение единого интерфейса для создания объектов разных подклассов.<p>
 * Применимость:<p>
 * - когда заранее неизвестны типы и зависимости объектов, с которыми должен работать ваш код;<p>
 * - когда вы хотите дать возможность пользователям расширять части вашего фреймворка или библиотеки;<p>
 * - когда вы хотите экономить системные ресурсы, повторно используя уже созданные объекты, вместо порождения новых;<p>
 * Преимущества и недостатки:<p>
 * + избавляет класс от привязки к конкретным классам продуктов;<p>
 * + выделяет код производства продуктов в одно место, упрощая поддержку кода;<p>
 * + упрощает добавление новых продуктов в программу;<p>
 * + реализует принцип открытости/закрытости;<p>
 * - может привести к созданию больших параллельных иерархий классов, так как для каждого класса продукта надо создать свой подкласс создателя
 */
public class FactoryMethodPattern {

    public static void main(String[] args) {
        FactoryMethodPattern example = new FactoryMethodPattern();

        Dialog webDialog = example.initDialog("web");
        webDialog.render();

        Dialog windowsDialog = example.initDialog("windows");
        windowsDialog.render();
    }

    private Dialog initDialog(String platformName) {
        if ("windows".equals(platformName)) {
            return new WindowsDialog();
        } else if ("web".equals(platformName)) {
            return new WebDialog();
        }
        return new WebDialog();
    }

}
