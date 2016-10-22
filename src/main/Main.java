package main;
import java.awt.Canvas;

/**
 * 
 * @author Sohum Shenoy 
 * @version 1.0.0
 * @since 10/21/2016
 *
 */
public class Main extends Canvas implements Runnable {

	private static final long serialVersionUID = 1L;
	
	//for Canvas window, with scaling as variable
	public static int WIDTH = 480;
	public static int HEIGHT = 270;
	public static int SCALE = 2;
	public Thread thread;
	
	/**
	 * by virtue of implementing java.lang.Runnable, we must add this method to create a Thread
	 */
	public synchronized void start(){
		
	}
	
	/**
	 * by virtue of implementing java.lang.Runnable, me must add this to close a Thread when done
	 */
	public synchronized void stop(){
		
	}
	
	/**
	 * 
	 */
	public void run() {
		
	}
	
	/**
	 * 
	 * @param args command line arguments for running in Command Prompt
	 */
	public static void main(String[] args) {


	}


}
