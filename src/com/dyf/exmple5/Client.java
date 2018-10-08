package com.dyf.exmple5;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Home home = new Home();
		Thread showTime = new Thread(home);
		showTime.start();
	}

}
