package se.application.main;

import java.io.IOException;

public class test {

	
		public static void main(String arg[]) throws IOException{
			Runtime runtime = Runtime.getRuntime();
			Process proc = runtime.exec("shutdown -s -t 0");
			System.exit(0);
		}

	}


