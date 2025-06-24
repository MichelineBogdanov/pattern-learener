package org.pattern_learener.behavioral.mediator.components;

import org.pattern_learener.behavioral.mediator.mediator.Mediator;
import org.pattern_learener.behavioral.mediator.mediator.Note;

import javax.swing.*;

public class List<E> extends JList<E> implements Component {

    private Mediator mediator;
    private final DefaultListModel<E> LIST_MODEL;


    public List(DefaultListModel<E> listModel) {
        super(listModel);
        this.LIST_MODEL = listModel;
        setModel(listModel);
        this.setLayoutOrientation(JList.VERTICAL);
        Thread thread = new Thread(new Hide(this));
        thread.start();
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void addElement(E note) {
        LIST_MODEL.addElement(note);
        int index = LIST_MODEL.size() - 1;
        setSelectedIndex(index);
        ensureIndexIsVisible(index);
        mediator.sendToFilter(LIST_MODEL);
    }

    public void deleteElement() {
        int index = this.getSelectedIndex();
        try {
            LIST_MODEL.remove(index);
            mediator.sendToFilter(LIST_MODEL);
        } catch (ArrayIndexOutOfBoundsException ignored) {
        }
    }

    public Note getCurrentElement() {
        return (Note) getSelectedValue();
    }

    @Override
    public String getName() {
        return "List";
    }

    private class Hide implements Runnable {

        private final List<E> list;

        Hide(List<E> list) {
            this.list = list;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(300);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                mediator.hideElements(list.isSelectionEmpty());
            }
        }
    }
}
