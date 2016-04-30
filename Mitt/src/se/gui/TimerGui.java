package se.gui;

import java.awt.event.ActionEvent;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import se.application.main.*;
import se.tools.ThreadTimer;
public class TimerGui {
	private JFrame F;
	private JButton b1;
	private JTextField t1;
	
	
	String tid;
	
	public void RunGuiT(){
		
		
		F = new JFrame("TIMER");
		F.setVisible(true);
		F.setSize(400,100);
		F.setResizable(false);
		F.setLocationRelativeTo(null);
		F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel mainpanel = new JPanel();


		b1 = new JButton("Ok");
		t1 = new JTextField("Skriv i minuter tills datorn ska stängas av sedan tryck ok");

		
		

		mainpanel.add(b1);
		mainpanel.add(t1);
		F.add(mainpanel);
	}
	public String getTid () {
		return tid;
	}
	public void actionPerformed(ActionEvent e) throws IOException {
		
		if (e.getSource() == b1){
			tid = t1.getText();
			ThreadTimer TT = new ThreadTimer();
			
			TT.run();
			
			
			
			
			
			F.setVisible(false);
		}
		
		
		}
	
}
