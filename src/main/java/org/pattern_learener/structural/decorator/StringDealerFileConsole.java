package org.pattern_learener.structural.decorator;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Определяет базовое поведение. Этот "компонент" будут потом оборачивать декораторы.
 */
public class StringDealerFileConsole implements StringDealer {

    @Override
    public void writeStringToConsole(String string) {
        System.out.println(string);
    }

    @Override
    public String readFromResources() {
        try {
            String filename = "test.txt";
            URI uri = getClass().getResource(String.format("/decorator/%s", filename)).toURI();
            return Files.readString(Paths.get(uri), StandardCharsets.UTF_8);
        } catch (IOException | URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
}
