package se.application.main;

import java.io.IOException;

public class TimerCode {

	
	
	
	public void shutdown() throws IOException{
		Runtime runtime = Runtime.getRuntime();
		Process proc = runtime.exec("shutdown -s -t 0");
		System.exit(0);
	}
}
