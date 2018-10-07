package com.dyf.exmple1;

public class SpeakElephant extends Thread{
	public void run(){
		for(int i=0;i<15;i++){
			System.out.println("Elephant speak:"+i);
		}
	}
}
