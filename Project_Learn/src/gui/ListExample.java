package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ListExample {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("List Example");

        JLabel l = new JLabel("Select Language");
        l.setBounds(100, 60, 300, 100);

        List list = new List();
        list.setMultipleMode(true);

        list.add("Java");
        list.add("Python");
        list.add("C++");

        list.setBounds(100, 150, 150, 80);

        JButton button = new JButton("Submit");

        button.setBounds(100, 250, 100, 50);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String[] msg = list.getSelectedItems();

                JOptionPane.showMessageDialog(frame, String.join(" ", msg) + " Selected");
            }
        });

        frame.add(l);
        frame.add(list);
        frame.add(button);

        frame.setSize(720, 720);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

}
