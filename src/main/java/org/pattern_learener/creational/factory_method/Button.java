package org.pattern_learener.creational.factory_method;

public interface Button {

    void render();

    void onClick();

}

class MacButton implements Button {

    @Override
    public void render() {
        System.out.println("Rendering MacButton");
    }

    @Override
    public void onClick() {
        System.out.println("Click MacButton");
    }
}

class WinButton implements Button {

    @Override
    public void render() {
        System.out.println("Rendering WinButton");
    }

    @Override
    public void onClick() {
        System.out.println("Click WinButton");
    }
}
