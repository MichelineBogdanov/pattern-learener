package org.pattern_learener.structural.adapter.class_adapter;

/**
 * Создаем адаптер, для того, чтобы мы могли из нашего "приложения" обращаться по интерфейсу DataBase к "базе".
 */
public class AdapterJavaToDataBase extends JavaApplication implements DataBase {

    @Override
    public void insert() {
        createObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void select() {
        selectObject();
    }

    @Override
    public void delete() {
        deleteObject();
    }

}
