package com.dyf.exmple3;
/**
 * ͨ����ͬ���̴߳�����ش���һ�����������
 * ��������� �̴߳�������ʵĿ����ȫ����  ����Ϊ�˻�ȡ��ǰ����ռ��CPU���߳���Ҫ�ֶ���ȥ��ȡ�̵߳�����
 * @author ASUS
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//����һ����ʵ����
		House house = new House();
		house.setWater(100);
		
		//������ʵ�����������ͬ�Ĵ������ǽ�����ͬһ�����Ƕ����run�����Լ�ʹ��ͬһ����ʵ�������Դ
		Thread cat = new Thread(house);
		Thread dog = new Thread(house);
		
		//ͨ��setName()������������ͬ���̴߳�������
		cat.setName("cat");
		dog.setName("dog");
		
		cat.start();
		dog.start();
	}

}
