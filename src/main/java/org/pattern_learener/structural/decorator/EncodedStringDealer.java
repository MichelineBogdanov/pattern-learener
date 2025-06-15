package org.pattern_learener.structural.decorator;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class EncodedStringDealer extends BasicStringDealer {

    public EncodedStringDealer() {
    }

    public EncodedStringDealer(StringDealer dealer) {
        super(dealer);
    }

    @Override
    public void writeStringToConsole(String string) {
        byte[] encode = Base64.getEncoder().encode(string.getBytes(StandardCharsets.UTF_8));
        super.writeStringToConsole(new String(encode));
    }

    @Override
    public String readFromResources() {
        String string = super.readFromResources();
        byte[] encode = Base64.getEncoder().encode(string.getBytes(StandardCharsets.UTF_8));
        return new String(encode);
    }

}
