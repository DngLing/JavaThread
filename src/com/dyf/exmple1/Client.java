package com.dyf.exmple1;
/**
 * 该项目用于
 * 通过继承Thread类  并重写run()方法 实现创建线程
 * 通过start()方法来开启某一线程
 * main方法本身就是一个线程
 * @author ASUS
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpeakElephant se = new SpeakElephant();
		SpeakCar  sc = new SpeakCar();
		
		se.start();
		sc.start();
		
		for(int i = 0;i<15;i++){
			System.out.println("main speak:"+i);
		}
		
	}

}
