package Graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Subsystems.StorageSubsystem;

// TODO: Create a simplistic gui layout for the user, such as components like inserting text and buttons

public class Display extends JFrame implements ActionListener {
    // Objects 
        static StorageSubsystem sub = new StorageSubsystem();
    // screen sizes
        public final int height = 220;
        public final int width = 200;
        public static void main(String[] args) {}
    
    // creates textfield
        static JTextField l;
    // stores operators 
        String s0, s1, s2;
    // default constructor
        public Display() {
            s0 = s1 = s2 = "";
        }
        public void screen() {
            JFrame frame = new JFrame("Informational Storage"); //  title
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // closes window
            frame.setVisible(true);
            
            try {
                // sets look and feel
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }

        // creates object of class
            Display d = new Display();;
        // creates additional textfield
            l = new JTextField(8); // coloumbs in text field
        // set the textfield to be non editable
            l.setEditable(false);
        // creates buttons for gui
            JButton b0, b1, b2, b3;
            b0 = new JButton("/");
            b1 = new JButton("/");
            b2 = new JButton("/");
            b3 = new JButton("'");
        // create a panel
            JPanel p = new JPanel();
        //  action listeners
            b0.addActionListener(d);
            b1.addActionListener(d);
            b2.addActionListener(d);
            b3.addActionListener(d);
        
        // add elements to panel
            p.add(b0);
            p.add(b1);
            p.add(b2);
            p.add(b3);
        // sets background color of panel
            p.setBackground(Color.blue);
        // add panel to frame
            frame.add(p);
            frame.setSize(this.width, this.height); // screen size
            frame.setVisible(true);
        }
        @Override
        public void actionPerformed(ActionEvent e) {
           sub.actionPerformed(e);
        }
}       