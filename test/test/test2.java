package test;

import com.itamar.smartStopLights.StopLightController;

public class test2 {

	public static void main(String[] args) {
		Thread t = new Thread(new StopLightController());
        t.start();

        // loop until 
        // thread exits
        while (t.isAlive()) {

        }
        System.out.println("Finished!");
	}

}
