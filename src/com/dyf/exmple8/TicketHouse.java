package com.dyf.exmple8;
/**
 * ʹ��wait()������ʵ��Эͬͬ��
 * @author ASUS
 *
 */
public class TicketHouse implements Runnable{

	int fiveAmount =2;
	int tenAmount = 0;
	int twentyAmount = 0;
	
	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("20Ԫ��Ʊ��")){
			saleTicket(20);
		}
		else if(Thread.currentThread().getName().equals("5Ԫ��Ʊ��")){
			saleTicket(5);
		}
	}
	
	public synchronized void saleTicket(int money){
		if(5 == money){
			fiveAmount++;
			System.out.println(Thread.currentThread().getName()+"֧����5Ԫ����������");
			System.out.println("��ǰ��Ǯ����   5Ԫ"+fiveAmount+"��");
		}
		else if(20 == money){
			while(fiveAmount < 3){
				try {
					System.out.println(Thread.currentThread().getName()+"֧����20Ԫ����ǰ��Ǯ���㣬�ȴ�����");
					wait();
					System.out.println(Thread.currentThread().getName()+"������Ʊ");
				} catch (InterruptedException e) {}
			}
			fiveAmount-=3;
			twentyAmount++;
			System.out.println("��"+Thread.currentThread().getName()+"����");
		}
		System.out.println("���ѵȴ��̣߳�");
		//���ѵȴ��̣߳�ִ�еȴ��̺߳�Ĳ���
		notifyAll();
	}
}
