
package bank.management.system;

import javax.swing.*;
import java.awt.*;

public class Transactions extends JFrame {
    
    Transactions(){
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 800, 700);
        add(image);
        
        JLabel text = new JLabel("Please Select Your Transaction");
        text.setBounds(185, 220, 700, 30);
        text.setForeground(Color.white);
        text.setFont(new Font("System", Font.BOLD,16));
        image.add(text);
        
        setSize(800,700);
        setLocation(250,0);
        setVisible(true);
    }
    
    public static void main(String args[]) {
       new Transactions();
    }
}
