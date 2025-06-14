package org.pattern_learener.creational.builder.canonic;

public class TestCanonicBuilder {

    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new EnterpriseWebsiteBuilder());
        Website website1 = director.buildWebsite();
        System.out.println(website1);

        director.setBuilder(new VisitCardWebsiteBuilder());
        Website website2 = director.buildWebsite();
        System.out.println(website2);
    }

}
