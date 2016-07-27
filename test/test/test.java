package test;

import com.itamar.smartStopLights.StopLight;
import static com.itamar.smartStopLights.StopLightStates.*;

public class test {
	
	
		
			public static void main(String[] args){
				
				
				StopLight light1=new StopLight();
				StopLight light2=new StopLight();
				StopLight light3=new StopLight();
				
				for (int i=0; i<3; i++){

				
								
				light1.setCurrentState(RED);
				System.out.println("light 1 is: " + light1.getCurrentState());
				
				light2.setCurrentState(RED_YELLOW);
				System.out.println("light 2 is: " + light2.getCurrentState());

				light1.setCurrentState(GREEN);
				System.out.println("light 1 is: " + light1.getCurrentState());
				
				light3.setCurrentState(FLASHING_GREEN);
				System.out.println("light 3 is: " + light3.getCurrentState());
				
				light2.setCurrentState(YELLOW);	
				System.out.println("light 2 is: " + light2.getCurrentState());

		}
				
	}

}
