package com.dyf.exmple2;
/**
 * ͨ��ʵ��Runnable �ӿ� ʹ�þ�̬������ʵ�ִ����߳�
 * �̵߳Ĵ��� 
 * 1.������ʵ����(ʵ��Runnable�Ķ���)
 * 2.�����������Thread���� ��ע����ʵ����
 * @author ASUS
 *
 */
public class Client {

	public static void main(String[] args) {
		//������ʵ����
		SpeakCar sc = new SpeakCar();
		SpeakElephant se = new SpeakElephant();
		//����������� ע����ʵ����
		Thread tsc = new Thread(sc);
		Thread tse = new Thread(se);
		//��ʼ��ǰ�߳�
		tsc.start();
		tse.start();
		
		

	}

}
