package se.tools;

import java.io.IOException;

import se.application.main.TimerCode;
import se.gui.TimerGui;

public class ThreadTimer extends Thread {
	TimerGui TG = new TimerGui();
	TimerCode TC = new TimerCode();

	public void run() {

		try {
			sleep(TG.getTid() * 60);
			TC.shutdown();
		} catch (InterruptedException | IOException e) {
			System.out.println("något gick fel");
			e.printStackTrace();
		}

	}

}
