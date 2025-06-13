package org.pattern_learener.creational.abstract_factory;

public class Application {

    private final Button button;

    private final CheckBox checkBox;

    private final RadioButton radioButton;

    public Application(OSFactory factory) {
        this.button = factory.createButton();
        this.checkBox = factory.createCheckBox();
        this.radioButton = factory.createRadioButton();
    }

    public void paint() {
        button.render();
        button.onClick();

        checkBox.render();
        checkBox.onClick();

        radioButton.render();
        radioButton.onClick();
    }
}
