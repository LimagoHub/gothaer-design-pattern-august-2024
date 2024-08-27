package gui;

import java.awt.*;

public class SimpleWindow extends Frame {

    public SimpleWindow() {
        super("Simple Window");
        setSize(500,500);
        Button b = new Button("Click Me");
        add(b);
        setVisible(true);
    }

    public static void main(String[] args) {

        new SimpleWindow();
    }
}