package practice;

import javax.swing.*;
import java.awt.event.*;

public class Question12 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JButton button = new JButton("Button");
        button.setBounds(100, 100, 100, 30);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(frame, "I AM CLICKED");
            }
        });

        frame.add(button);

        frame.setSize(720, 720);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
