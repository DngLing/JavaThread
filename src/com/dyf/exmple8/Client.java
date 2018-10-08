package com.dyf.exmple8;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicketHouse th = new TicketHouse();
		Thread five  = new Thread(th);
		Thread twenty = new Thread(th);
		
		five.setName("5元购票人");
		twenty.setName("20元购票人");
		
		five.start();
		twenty.start();
	}

}
