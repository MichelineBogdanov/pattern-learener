package org.pattern_learener.creational.builder.canonic;

public abstract class WebsiteBuilder {

    Website website;

    void createWebsite() {
        this.website = new Website();
    }

    abstract void buildName();
    abstract void buildCms();
    abstract void buildPrice();

    Website getWebsite() {
        return this.website;
    }

}
