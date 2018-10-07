package com.dyf.exmple2;

public class SpeakCar implements Runnable{
	public void run(){
		for(int i=0;i<15;i++){
			System.out.println("Car speak:"+i);
		}
	}
}
