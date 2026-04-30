package gui;

import javax.swing.*;
import java.awt.event.*;

public class ChoiceExample {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Choice Example");

        JLabel l = new JLabel("Select Language");
        l.setBounds(100, 60, 300, 100);

        JComboBox<String> c = new JComboBox<>();

        c.setBounds(100, 150, 150, 30);

        c.addItem("Java");
        c.addItem("Python");
        c.addItem("C++");

        JButton button = new JButton("Submit");

        button.setBounds(100, 200, 100, 50);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String msg = (String) c.getSelectedItem();

                JOptionPane.showMessageDialog(frame, msg + " Selected");
            }
        });

        frame.add(l);
        frame.add(c);
        frame.add(button);

        frame.setSize(720, 720);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

}
