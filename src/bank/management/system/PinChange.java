
package bank.management.system;
import java.awt.*;
import javax.swing.*;

public class PinChange extends JFrame {
        String pinumber;
        
    PinChange(String pinnumber){       
       
        
        setLayout(null);        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 800, 700);
        add(image);
        
        JLabel text = new JLabel("CHANGE YOUR PIN");
        text.setForeground(Color.white);
        text.setFont(new Font("System", Font.BOLD,  16));
        text.setBounds(220,220,200,30);
        image.add(text);
        
        setSize(800,700);
        setLocation(250,5);
        setVisible(true);
    }    
    public static void main(String args[]) {
        new PinChange("");
    }
}
