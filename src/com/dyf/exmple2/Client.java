package com.dyf.exmple2;
/**
 * 通过实现Runnable 接口 使用静态代理来实现创建线程
 * 线程的创建 
 * 1.创建真实对象(实现Runnable的对象)
 * 2.创建代理对象Thread对象 ，注入真实对象
 * @author ASUS
 *
 */
public class Client {

	public static void main(String[] args) {
		//创建真实对象
		SpeakCar sc = new SpeakCar();
		SpeakElephant se = new SpeakElephant();
		//创建代理对象 注入真实对象
		Thread tsc = new Thread(sc);
		Thread tse = new Thread(se);
		//开始当前线程
		tsc.start();
		tse.start();
		
		

	}

}
