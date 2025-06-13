package org.pattern_learener.creational.factory_method;

/**
 * Базовый класс фабрики. "Фабрика" — это всего
 * лишь дополнительная роль для класса. Скорее всего, он уже
 * имеет какую-то бизнес-логику, в которой требуется создание
 * разнообразных продуктов.
 */
public abstract class Dialog {

    public void render() {
        // Чтобы использовать фабричный метод, мы должны
        // убедиться в том, что эта бизнес-логика не зависит от
        // конкретных классов продуктов. Button — это общий
        // интерфейс кнопок, поэтому все хорошо.
        Button button = createButton();
        button.render();
        button.onClick();
    }

    /**
     * Мы выносим весь код создания продуктов в особый метод, который называют "фабричным".
     */
    protected abstract Button createButton();

}

/**
 * Конкретные фабрики переопределяют фабричный метод и возвращают из него собственные продукты.
 */
class WebDialog extends Dialog {

    @Override
    protected Button createButton() {
        return new HtmlButton();
    }

}

class WindowsDialog extends Dialog {

    @Override
    protected Button createButton() {
        return new WindowsButton();
    }

}
