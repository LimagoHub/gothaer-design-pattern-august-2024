package gui;

import java.awt.*;
import java.awt.event.*;

public class SimpleWindow extends Frame  {

    public SimpleWindow() {
        super("Simple Window");
        addWindowListener(new MyWindowListener() );
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(final KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                    beenden();
                }
            }
        });
        setSize(500,500);
        Button b = new Button("Click Me");
        //b.addActionListener(new ButtonListener());
        b.addActionListener(e->ausgabe());
        add(b);
        setVisible(true);
    }

    public static void main(String[] args) {

        new SimpleWindow();
    }

    private void ausgabe() {
        System.out.println("Hallo");
    }

    private void beenden() {
        System.out.println("Daten sichern");
        dispose();
    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            ausgabe();
        }
    }

    class MyWindowListener extends WindowAdapter {

        @Override
        public void windowClosing(final WindowEvent e) {
            beenden();
        }
    }
}