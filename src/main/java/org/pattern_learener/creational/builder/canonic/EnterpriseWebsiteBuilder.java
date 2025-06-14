package org.pattern_learener.creational.builder.canonic;

public class EnterpriseWebsiteBuilder extends WebsiteBuilder {

    @Override
    void buildName() {
        website.setName("Enterprise Website");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.ALIFRESCO);
    }

    @Override
    void buildPrice() {
        website.setPrice(10000);
    }

}
