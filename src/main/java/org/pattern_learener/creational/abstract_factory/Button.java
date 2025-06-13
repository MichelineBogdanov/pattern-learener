package org.pattern_learener.creational.abstract_factory;

public interface Button {

    void render();

    void onClick();

}

class WinButton implements Button {

    @Override
    public void render() {
        System.out.println("Rendering WinButton");
    }

    @Override
    public void onClick() {
        System.out.println("Click on WinButton");
    }
}

class MacButton implements Button {

    @Override
    public void render() {
        System.out.println("Rendering MacButton");
    }

    @Override
    public void onClick() {
        System.out.println("Click on MacButton");
    }
}
