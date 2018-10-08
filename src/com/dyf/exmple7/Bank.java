package com.dyf.exmple7;

public class Bank implements Runnable{

	int money  = 200;
	
	public void setMoney(int money){
		this.money = money;
	}
	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("Take")){
			//该方法被"Take" 线程使用时 "Save"线程不会使用它除非等到它结束
			this.saveOrTake(300);
		}else if(Thread.currentThread().getName().equals("Save")){
			//同理
			this.saveOrTake(150);
		}
		
	}
	
	//使用synchronized 修饰该方法，线程使用该方法时会遵循线程同步机制
	public synchronized void saveOrTake(int amount){
		if(Thread.currentThread().getName().equals("Take")){
			for(int i=1;i<=3;i++){
				money-=amount/3;
				System.out.println("第"+i+"次取出现金"+amount/3+",账户剩余"+money+"元");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		else if(Thread.currentThread().getName().equals("Save")){
			for(int i=0;i<=3;i++){
				money+=amount/3;
				System.out.println("第"+i+"次存入现金"+amount/3+",账户剩余"+money+"元");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
