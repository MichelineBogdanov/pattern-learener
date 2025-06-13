package org.pattern_learener.creational.abstract_factory;

public interface RadioButton {

    void render();

    void onClick();

}

class WinRadioButton implements RadioButton {

    @Override
    public void render() {
        System.out.println("Rendering WinRadioButton");
    }

    @Override
    public void onClick() {
        System.out.println("Click on WinRadioButton");
    }
}

class MacRadioButton implements RadioButton {

    @Override
    public void render() {
        System.out.println("Rendering MacRadioButton");
    }

    @Override
    public void onClick() {
        System.out.println("Click on MacRadioButton");
    }
}
