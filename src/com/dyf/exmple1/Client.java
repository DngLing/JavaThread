package com.dyf.exmple1;
/**
 * ����Ŀ����
 * ͨ���̳�Thread��  ����дrun()���� ʵ�ִ����߳�
 * ͨ��start()����������ĳһ�߳�
 * main�����������һ���߳�
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
