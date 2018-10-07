package com.dyf.exmple3;
/**
 * 通过不同的线程代理共享地处理一个对象的数据
 * 这种情况下 线程代理与真实目标完全解耦  我们为了获取当前正在占用CPU的线程需要手动地去获取线程地名字
 * @author ASUS
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//创建一个真实对象
		House house = new House();
		house.setWater(100);
		
		//创建真实对象的两个不同的代理，他们将调用同一个真是对象的run方法以及使用同一个真实对象的资源
		Thread cat = new Thread(house);
		Thread dog = new Thread(house);
		
		//通过setName()方法给两个不同的线程代理命名
		cat.setName("cat");
		dog.setName("dog");
		
		cat.start();
		dog.start();
	}

}
