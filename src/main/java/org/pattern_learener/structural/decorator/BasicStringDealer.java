package org.pattern_learener.structural.decorator;

/**
 * Базовый декоратор хранит ссылку на вложенный объект-компонент. Им может быть как конкретный компонент, так и один из конкретных декораторов.
 * Базовый декоратор делегирует все свои операции вложенному объекту. Дополнительное поведение будет жить в конкретных декораторах.
 */
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
