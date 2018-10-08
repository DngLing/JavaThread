package com.dyf.exmple5;
/**
 * 当前代理被赋予新的代理时，当前线程实体会变成“垃圾”，但不会被JVM回收，因为它依然在运行
 * 
 */
import java.text.SimpleDateFormat;
import java.util.Date;

public class Home implements Runnable{

	int time =0;
	Date date;
	SimpleDateFormat m = new SimpleDateFormat("hh:mm:ss");
	
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			date = new Date();
			System.out.println(m.format(date));
			time++;
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//第三秒时 获取当前线程并将此线程赋予新的代理实体
			if(time==3){
				Thread newThread = Thread.currentThread();
				newThread = new Thread(this);
				newThread.start();
			}
		}
	}

}
