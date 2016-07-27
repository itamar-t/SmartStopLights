package com.itamar.smartStopLights;

public class StopLight {
	private StopLightStates currentState;
	
	
	public StopLight(){	}

	public StopLight(StopLightStates state){
		currentState=state;
	}

	public StopLightStates getCurrentState(){
		return currentState;
	}
	
	public void setCurrentState(StopLightStates state){
		this.currentState=state;
	}
}
