package se.tools;

import java.io.IOException;

import se.application.main.TimerCode;
import se.gui.TimerGui;


public class ThreadTimer extends Thread {
	TimerGui TG = new TimerGui ();
	TimerCode  TC = new TimerCode();

    public void run() {
    	
		try {
			sleep(TG.getTid()* 1000);
			TC.shutdown();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
         
    }
}
	
	
	
	
	

