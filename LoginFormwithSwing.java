package swingApiPackage;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LoginFormwithSwing  extends JFrame implements ActionListener{
	
	JLabel l1,l2;
	JTextField t1;
	JPasswordField p1;
	JButton btn;
	
	LoginFormwithSwing(){
		this.setSize(300, 400);
		this.setLayout(null);
		
		l1=new JLabel("Enter Name");
		l1.setBounds(10,100,100,40);
		this.add(l1);
		
		t1=new JTextField();
		t1.setBounds(120,100,100,30);
		this.add(t1);
		
		l2=new JLabel("Enter Passowrd");
		l2.setBounds(10,150,100,40);
		this.add(l2);
		
		p1=new JPasswordField();
		p1.setBounds(120,140,100,30);
		this.add(p1);
		
		btn=new JButton("Login");
		btn.setBounds(100,180,70,40);
		this.add(btn);
		btn.addActionListener(this);
		
		
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String name=t1.getText();
		char ch[]= p1.getPassword();
		String pass=String.valueOf(ch);
		
		if(e.getSource()==btn) {
			if(name.equals("shubhu") && pass.equals("123")) {
				new calculatorwithSwing();
			}
			else {
				JOptionPane.showMessageDialog(this,"Error");
			}
		}
		
	}
	
 public static void main(String[] args) {
	 new LoginFormwithSwing();
 }
}
