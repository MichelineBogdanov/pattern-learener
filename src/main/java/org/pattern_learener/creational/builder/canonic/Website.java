package org.pattern_learener.creational.builder.canonic;

public class Website {

    private String name;
    private Cms cms;
    private int price;

    public Website() {
    }

    public Website(String name, Cms cms, int price) {
        this.name = name;
        this.cms = cms;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cms getCms() {
        return cms;
    }

    public void setCms(Cms cms) {
        this.cms = cms;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Website{" +
                "name='" + name + '\'' +
                ", cms=" + cms +
                ", price=" + price +
                '}';
    }
}
