package se.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class FirstPage implements ActionListener {
	private JFrame F;
	private JPanel p1;
	private JPanel p2;
	private JButton b1;
	private JButton b2;
	private JButton b3;
	private JLabel l1;
	
TimerGui t = new TimerGui();
	
	

public void RunGui(){
	
	F = new JFrame("K.J.E.L.L");
	F.setVisible(true);
	F.setSize(400,300);
	F.setResizable(false);
	F.setLocationRelativeTo(null);
	F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JPanel mainpanel = new JPanel();
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	l1 = new JLabel("Välj vilket program du vill använda!");
	b1 = new JButton("Diabetes Pump");
	b2 = new JButton("Randomize Teams");
	b3 = new JButton("Timer");
	b1.addActionListener(this);
	b2.addActionListener(this);	
	b3.addActionListener(this);
	
	p1.add(l1);
	p2.add(b1);
	p2.add(b2);
	p2.add(b3);

	
	F.add(mainpanel);
	
	mainpanel.add(p1);
	mainpanel.add(p2);


	

}
public void actionPerformed(ActionEvent e) {
		
	if (e.getSource() == b3){
		t.RunGuiT();
		F.setVisible(false);
	}
	
	
	}



}

