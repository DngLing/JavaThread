package com.dyf.exmple4;
/**
 * 该情况是代理线程与真实对象的弱耦合，该真实对象拥有它的代理对象。-
 * @author ASUS
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		House h = new House();
		h.setWater(100);
		h.cat.start();
		h.dog.start();
		
	}

}
