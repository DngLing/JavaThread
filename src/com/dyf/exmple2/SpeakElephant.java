package com.dyf.exmple2;

public class SpeakElephant implements Runnable{

	@Override
	public void run() {
		for(int i =0;i<15;i++)
			System.out.println("Elephant speak:"+i);
		
	}

}
