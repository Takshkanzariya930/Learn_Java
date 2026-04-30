package gui;

import javax.swing.*;

public class LableExample {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Lable Example");

        JLabel l = new JLabel("I am Lable in Lable Example Frame");
        l.setBounds(100, 100, 300, 100);

        frame.add(l);
        frame.setSize(720, 720);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

}
