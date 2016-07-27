package com.itamar.smartStopLights;

import java.text.SimpleDateFormat;
import java.util.Date;

public class training {

	public static void main(String[] args){
		Date dNow = new Date( );
		SimpleDateFormat ft = 
		new SimpleDateFormat ("yyyy/MM/dd 'at' HH:mm:ss zzz");

		System.out.println("Current Date: " + ft.format(dNow));	}
}
