package org.pattern_learener.creational.abstract_factory;


public abstract class OSFactory {

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


