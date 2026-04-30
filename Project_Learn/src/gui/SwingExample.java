package gui;

import javax.swing.*;

public class SwingExample {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("My first GUI");

        JButton button = new JButton("Click Me");

        button.setBounds(200, 100, 200, 40);

        frame.add(button);

        frame.setSize(720, 720);

        frame.setLayout(null);

        frame.setVisible(true);

    }

}
