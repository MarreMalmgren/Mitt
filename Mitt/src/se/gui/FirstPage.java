package se.gui;

import java.awt.*;
import javax.swing.*;


public class FirstPage {
	private JFrame F;
	private JPanel p1;
	private JPanel p2;
	private JButton b1;
	private JButton b2;
	private JButton b3;
	private JLabel l1;
	


public void RunGui(){
	
	F = new JFrame("K.J.E.L.L");
	F.setVisible(true);
	F.setSize(600,400);
	F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	p1 = new JPanel();
	p2 = new JPanel();
	l1 = new JLabel("Välj vilket program du vill använda!");
	l1.setSize(300,200);
	b1 = new JButton("Diabetes Pump");
	b2 = new JButton("Randomize Teams");
	b3 = new JButton("Timer");

	
	p2.add(l1);
	p1.add(b1);
	p1.add(b2);
	p1.add(b3);

	F.add(p2);
	F.add(p1);

}

}

