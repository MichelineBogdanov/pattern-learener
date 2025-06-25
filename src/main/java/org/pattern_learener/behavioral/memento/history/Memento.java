package org.pattern_learener.behavioral.memento.history;

import org.pattern_learener.behavioral.memento.editor.Editor;

public class Memento {

    private final String backup;
    private final Editor editor;

    public Memento(Editor editor) {
        this.editor = editor;
        this.backup = editor.backup();
    }

    public void restore() {
        editor.restore(backup);
    }
}
