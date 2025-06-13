package org.pattern_learener.creational.abstract_factory;


public abstract class OSFactory {

    public void render() {
        Button button = createButton();
        button.render();
        button.onClick();

        CheckBox checkBox = createCheckBox();
        checkBox.render();
        checkBox.onClick();

        RadioButton radioButton = createRadioButton();
        radioButton.render();
        radioButton.onClick();
    }

    protected abstract Button createButton();

    protected abstract CheckBox createCheckBox();

    protected abstract RadioButton createRadioButton();

}

class WinOSFactory extends OSFactory {

    @Override
    protected Button createButton() {
        return new WinButton();
    }

    @Override
    protected CheckBox createCheckBox() {
        return new WinCheckBox();
    }

    @Override
    protected RadioButton createRadioButton() {
        return new WinRadioButton();
    }

}

class MacOSFactory extends OSFactory {

    @Override
    protected Button createButton() {
        return new MacButton();
    }

    @Override
    protected CheckBox createCheckBox() {
        return new MacCheckBox();
    }

    @Override
    protected RadioButton createRadioButton() {
        return new MacRadioButton();
    }

}


