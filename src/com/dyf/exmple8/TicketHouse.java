package com.dyf.exmple8;
/**
 * 使用wait()方法，实现协同同步
 * @author ASUS
 *
 */
public class TicketHouse implements Runnable{

	int fiveAmount =2;
	int tenAmount = 0;
	int twentyAmount = 0;
	
	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("20元购票人")){
			saleTicket(20);
		}
		else if(Thread.currentThread().getName().equals("5元购票人")){
			saleTicket(5);
		}
	}
	
	public synchronized void saleTicket(int money){
		if(5 == money){
			fiveAmount++;
			System.out.println(Thread.currentThread().getName()+"支付了5元，无需找零");
			System.out.println("当前零钱储备   5元"+fiveAmount+"张");
		}
		else if(20 == money){
			while(fiveAmount < 3){
				try {
					System.out.println(Thread.currentThread().getName()+"支付了20元，当前零钱不足，等待找零");
					wait();
					System.out.println(Thread.currentThread().getName()+"继续购票");
				} catch (InterruptedException e) {}
			}
			fiveAmount-=3;
			twentyAmount++;
			System.out.println("给"+Thread.currentThread().getName()+"找零");
		}
		System.out.println("唤醒等待线程！");
		//唤醒等待线程，执行等待线程后的操作
		notifyAll();
	}
}
