package swingApiPackage;
import java.awt.Color;
import java.awt.Container;


import javax.swing.*;



public class First {
	 public  First() {
    
        JFrame frame = new JFrame("Swing_API");
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        Container clr=frame.getContentPane();
        clr.setBackground(Color.cyan);
        
	 }
public static void main(String[] args) {
	
	new First();
}
}

