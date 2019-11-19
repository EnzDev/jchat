package fr.insa.jchat.client;

import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;

public class ActionButton extends Button {
    private String action;

    public ActionButton(String text, String tooltip, String action) {
        super(text);
        this.action = action;
        this.setTooltip(new Tooltip(text));
        this.setOnAction(event -> ActionController.handleAction(action));
    }
}
