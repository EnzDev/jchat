package fr.insa.jchat.client.util;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.MultipleSelectionModel;

// https://stackoverflow.com/a/46186195
public class NoSelectionModel<T> extends MultipleSelectionModel<T> {
    @Override
    public ObservableList<Integer> getSelectedIndices() {
        return FXCollections.emptyObservableList();
    }

    @Override
    public ObservableList<T> getSelectedItems() {
        return FXCollections.emptyObservableList();
    }

    @Override
    public void selectIndices(int index, int... indices) {
        // nothing
    }

    @Override
    public void selectAll() {
        // nothing
    }

    @Override
    public void clearAndSelect(int index) {
        // nothing
    }

    @Override
    public void select(int index) {
        // still nothing
    }

    @Override
    public void select(T obj) {
        // wait ...
        // no nothing
    }

    @Override
    public void clearSelection(int index) {
        // some more nothing
    }

    @Override
    public void clearSelection() {
        // well guess what
    }

    @Override
    public boolean isSelected(int index) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public void selectPrevious() {
        // ¯\_(ツ)_/¯
    }

    @Override
    public void selectNext() {
        // nope
    }

    @Override
    public void selectFirst() {
        // ...
    }

    @Override
    public void selectLast() {
        //
    }
}
