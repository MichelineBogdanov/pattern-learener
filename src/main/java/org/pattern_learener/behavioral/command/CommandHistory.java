package org.pattern_learener.behavioral.command;

import java.util.Stack;

public class CommandHistory {

    private final Stack<Command> history = new Stack<>();

    public void push(Command c) {
        history.push(c);
    }

    public Command pop() {
        return history.pop();
    }

    public boolean isEmpty() { return history.isEmpty(); }
}
