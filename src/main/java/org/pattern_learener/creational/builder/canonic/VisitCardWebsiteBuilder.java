package org.pattern_learener.creational.builder.canonic;

public class VisitCardWebsiteBuilder extends WebsiteBuilder{

    @Override
    void buildName() {
        website.setName("Visit card");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.WORDPRESS);
    }

    @Override
    void buildPrice() {
        website.setPrice(500);
    }

}
