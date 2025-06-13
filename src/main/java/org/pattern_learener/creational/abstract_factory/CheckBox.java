package org.pattern_learener.creational.abstract_factory;

public interface CheckBox {

    void render();

    void onClick();

}

class WinCheckBox implements CheckBox {

    @Override
    public void render() {
        System.out.println("Rendering WinCheckBox");
    }

    @Override
    public void onClick() {
        System.out.println("Click on WinCheckBox");
    }
}

class MacCheckBox implements CheckBox {

    @Override
    public void render() {
        System.out.println("Rendering MacCheckBox");
    }

    @Override
    public void onClick() {
        System.out.println("Click on MacCheckBox");
    }
}
