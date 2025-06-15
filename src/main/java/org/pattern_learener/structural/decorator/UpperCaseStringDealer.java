package org.pattern_learener.structural.decorator;

public class UpperCaseStringDealer extends BasicStringDealer {

    public UpperCaseStringDealer() {
    }

    public UpperCaseStringDealer(StringDealer dealer) {
        super(dealer);
    }

    @Override
    public void writeStringToConsole(String string) {
        String upperCaseString = string.toUpperCase();
        super.writeStringToConsole(upperCaseString);
    }

    @Override
    public String readFromResources() {
        String string = super.readFromResources();
        return string.toUpperCase();
    }

}
