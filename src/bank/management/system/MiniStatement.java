
package bank.management.system;
import javax.swing.*;
import java.awt.*;

public class MiniStatement extends JFrame {
    
    MiniStatement(){
        setTitle("Mini Statement");
        
        setLayout(null);
        
        
        
        
        setSize(400,600);
        setLocation(20,20);
        getContentPane().setBackground(Color.white);
        setVisible(true);
    }   
    public static void main(String args[]) {
       new MiniStatement();
    }
}
