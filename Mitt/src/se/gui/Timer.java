package se.gui;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Timer {
	private JFrame F;
	private JButton b1;
	
	
	//FirstPage fp = new FirstPage();
	
	
	public void RunGuiT(){
		
		
		F = new JFrame("TIMER");
		F.setVisible(true);
		F.setSize(400,300);
		F.setResizable(false);
		F.setLocationRelativeTo(null);
		F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel mainpanel = new JPanel();


		b1 = new JButton("Tillbaka");
		

		
		

		mainpanel.add(b1);
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == b1){
			
			F.setVisible(false);
		}
		
		
		}
	
}
