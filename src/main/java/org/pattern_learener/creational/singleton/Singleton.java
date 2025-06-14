package org.pattern_learener.creational.singleton;

public class Singleton {

    private static volatile Singleton INSTANCE;

    private Singleton() {

    }

    /**
     * Техника называется Double-Checked Locking, необходимо пометить поле INSTANCE как volatile.
     */
    public static Singleton getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton();
                }
                return INSTANCE;
            }
        }
        return INSTANCE;
    }

}
