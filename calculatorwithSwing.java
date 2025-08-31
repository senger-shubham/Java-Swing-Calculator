package swingApiPackage;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class calculatorwithSwing extends JFrame implements ActionListener {
	
	JTextField t1,t2,t3;
	JLabel L1,L2,L3;
	JButton add , sub, multi, div, rem ;
	calculatorwithSwing(){
		this.setSize(300,400);
		this.setTitle("swing-api");
		this.setLayout(null);
		  
		
		//Label
		
		L1=new JLabel("First");
		L1.setBounds(10,50,40,20);
		this.add(L1);
		
		t1=new JTextField();
		t1.setBounds(60, 50, 100, 20);
		this.add(t1);
		
		//Label2
		
		L2=new JLabel("Second");
		L2.setBounds(10,80,50,20);
		this.add(L2);
		
		t2=new JTextField();
		t2.setBounds(60, 80, 100, 20);
		this.add(t2);
		
		
		//Label3
		L3=new JLabel("Result");
		L3.setBounds(10,130,40,20);
		this.add(L3);
		
		t3=new JTextField();
		t3.setBounds(60, 130, 100, 20);
		this.add(t3);
		
		
		
		
		//Buttons
		
		
		add=new JButton("add");
		add.setBounds(10,190, 60, 20);
		this.add(add);
		add.addActionListener(this);
		
		sub=new JButton("sub");
		sub.setBounds(80,190, 60, 20);
		this.add(sub);
		sub.addActionListener(this);
		
		
		multi=new JButton("Multi");
		multi.setBounds(150,190, 70, 20);
		this.add(multi);
		multi.addActionListener(this);
		
		
		div=new JButton("div");
		div.setBounds(30,230, 60, 20);
		this.add(div);
		div.addActionListener(this);
		
		
		rem=new JButton("rem");
		rem.setBounds(100,230, 60, 20);
		this.add(rem);
		rem.addActionListener(this);
		
		this.setVisible(true);
		
		Container clr=this.getContentPane();
		clr.setBackground(Color.cyan);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String s1=t1.getText();
		String s2=t2.getText();
		double a,b,c=0;
		a=Double.parseDouble(s1);
		b=Double.parseDouble(s2);
		 if(e.getSource() == add) {
			 c=a+b;
		 }
		 else if(e.getSource() == sub) {
			 c=a-b;
		 }
		 else if(e.getSource() == multi) {
			 
			 c=a*b;
		 }
		 else if(e.getSource() == div) {
			 if(b==0) {
				 t3.setForeground(Color.red);
				 t3.setText("Error : Divide by 0");
				 return;
			 }
			 c=a/b;
		 }
		 else if(e.getSource() == rem) {
			 if(b ==0) {
				 t3.setForeground(Color.red);
				 t3.setText("Error: Mod by 0");
			        return;
			 }
			 c=a%b;
		 }
		 String res=String.valueOf(c);
		 t3.setText(res);
		 
		
	}
	
	public static void main(String[] args) {
		new calculatorwithSwing();
	}
	

}
