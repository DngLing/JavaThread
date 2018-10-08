package com.dyf.exmple7;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new Bank();
		bank.setMoney(400);
		Thread take, save;
		take = new Thread(bank);
		save = new Thread(bank);
		take.setName("Take");
		save.setName("Save");
		
		take.start();
		save.start();
	}

}
