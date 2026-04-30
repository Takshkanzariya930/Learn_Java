package gui;

import javax.swing.*;
import java.awt.event.*;

public class SwingExample2 {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Button click Event");

        JButton button = new JButton("Click Me");

        button.setBounds(100, 100, 100, 40);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(frame, "Button CLicked");
                System.out.println("Buttton Clicked");
            }
        });

        frame.add(button);
        frame.setSize(720, 720);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

}
