package com.dyf.exmple3;

public class House implements Runnable{

	private int water;
	
	public void setWater(int water ){
		this.water =water;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			//使用静态方法Thread.currentThread().getName(),获得当前线程以及当前线程地名字
			String name = Thread.currentThread().getName();
			if(name.equals("dog")){
				System.out.println("dog drink water");
				water -=2;
			}
			else if(name.equals("cat")){
				System.out.println("cat drink water");
				water-=1;
			}
			System.out.println("lose water:"+water);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(water<=0){
				return;
			}
		}
	}

}
