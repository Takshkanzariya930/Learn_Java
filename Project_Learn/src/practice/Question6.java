package practice;

import javax.swing.*;
import java.awt.event.*;

public class Question6 
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("My Frame");
        
        JTextField tf = new JTextField("Name");
        tf.setBounds(100, 100, 200, 30);

        JButton button = new JButton();
        button.setBounds(140, 140, 100, 30);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String msg = (String) tf.getText();

                JOptionPane.showMessageDialog(frame, "Your Name is " + msg);
            }
        });

        frame.add(tf);
        frame.add(button);

        frame.setSize(720, 720);
        frame.setLayout(null);
        frame.setVisible(true);
    }    
}
