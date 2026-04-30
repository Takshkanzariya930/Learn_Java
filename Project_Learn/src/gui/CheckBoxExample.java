package gui;

import javax.swing.*;
import java.awt.event.*;

public class CheckBoxExample {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Check Box Example");

        JLabel l = new JLabel("Select Language");
        l.setBounds(100, 60, 300, 100);

        JCheckBox cb1 = new JCheckBox("Java");
        JCheckBox cb2 = new JCheckBox("Python");

        cb1.setBounds(100, 130, 100, 30);
        cb2.setBounds(100, 160, 100, 30);

        JButton button = new JButton("Submit");

        button.setBounds(100, 200, 100, 30);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String msg = "";

                if (cb1.isSelected()) 
                {
                    msg = "Java";
                }
                if (cb2.isSelected()) 
                {
                    msg = "Python";
                }

                JOptionPane.showMessageDialog(frame, "Selected Language : " + msg);
            }
        });

        frame.add(l);
        frame.add(cb1);
        frame.add(cb2);
        frame.add(button);

        frame.setSize(720, 720);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

}
