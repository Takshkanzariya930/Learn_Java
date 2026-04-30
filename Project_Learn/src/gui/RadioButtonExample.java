package gui;

import javax.swing.*;
import java.awt.event.*;

public class RadioButtonExample {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Radio Button Example");

        JLabel l = new JLabel("Select Gender");
        l.setBounds(100, 60, 300, 100);

        JRadioButton rb1 = new JRadioButton("Male");
        JRadioButton rb2 = new JRadioButton("Female");

        rb1.setBounds(100, 130, 100, 30);
        rb2.setBounds(100, 160, 100, 30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);

        JButton button = new JButton("Submit");

        button.setBounds(100, 200, 100, 30);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String msg = "";

                if (rb1.isSelected()) 
                {
                    msg = "Male";
                }
                if (rb2.isSelected()) 
                {
                    msg = "Female";
                }

                JOptionPane.showMessageDialog(frame, msg + " Selected");
            }
        });

        frame.add(l);
        frame.add(rb1);
        frame.add(rb2);
        frame.add(button);

        frame.setSize(720, 720);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

}
