package com.itamar.smartStopLights;

import static com.itamar.smartStopLights.StopLightStates.*;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StopLightController implements Runnable {
    
	StopLight sl=new StopLight();
	SimpleDateFormat ft = new SimpleDateFormat ("yyyy/MM/dd 'at' HH:mm:ss zzz");

	public void run() {
    	
    	try {
    		
			for(int i=0; i<5; i++){

				runTo(RED, 6 );
				runTo(RED_YELLOW,1.5);
				runTo(GREEN,4);
				runTo(FLASHING_GREEN,3);
				runTo(YELLOW,1);
			}

    	} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	
	private void runTo(StopLightStates state, double seconds) throws InterruptedException{
		Date dNow = new Date( );

		sl.setCurrentState(state);
		System.out.println(ft.format(dNow) + ": " + sl.getCurrentState());
		Thread.sleep((long) (seconds * 1000));
	}
}