package org.pattern_learener.structural.decorator;

public class BasicStringDealer implements StringDealer {

    private StringDealer dealer;

    public BasicStringDealer() {
    }

    public BasicStringDealer(StringDealer dealer) {
        this.dealer = dealer;
    }

    @Override
    public void writeStringToConsole(String string) {
        dealer.writeStringToConsole(string);
    }

    @Override
    public String readFromResources() {
        return dealer.readFromResources();
    }

}
