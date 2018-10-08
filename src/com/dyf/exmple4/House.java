package com.dyf.exmple4;

public class House implements Runnable{
	
	private int water;
	//��ʵ����ӵ�����Ĵ����������ϵ�ʹ�ô�������������
	Thread dog;
	Thread cat;
		
	public House(){
		dog = new Thread(this);
		cat = new Thread(this);
	}
	
	public void setWater(int water){
		this.water  = water;
	}
	public void run() {
		while(true){
			if(water <=0)
				return;
			Thread t = Thread.currentThread();
			
			if(t == dog){
				System.out.println("dog drink");
				water-=2;
			}
			else if(t == cat){
				System.out.println("cat drink");
				water-=1;
			}
			
			System.out.println("lose water "+ water);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
