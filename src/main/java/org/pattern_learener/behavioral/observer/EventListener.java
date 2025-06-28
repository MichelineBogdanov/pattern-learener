package org.pattern_learener.behavioral.observer;

import java.io.File;

public interface EventListener {

    void update(String eventType, File file);

}
