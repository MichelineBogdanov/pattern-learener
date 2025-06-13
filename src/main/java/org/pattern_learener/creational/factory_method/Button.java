package org.pattern_learener.creational.factory_method;

public interface Button {

    void render();

    void onClick();

}

class HtmlButton implements Button {

    @Override
    public void render() {
        System.out.println("Rendering HtmlButton");
    }

    @Override
    public void onClick() {
        System.out.println("Click HtmlButton");
    }
}

class WindowsButton implements Button {

    @Override
    public void render() {
        System.out.println("Rendering WindowsButton");
    }

    @Override
    public void onClick() {
        System.out.println("Click WindowsButton");
    }
}
