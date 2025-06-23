package org.pattern_learener.behavioral.iterator;

public interface ProfileIterator {

    boolean hasNext();

    Profile getNext();

    void reset();

}
