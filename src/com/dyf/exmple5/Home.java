package com.dyf.exmple5;
/**
 * ��ǰ���������µĴ���ʱ����ǰ�߳�ʵ����ɡ��������������ᱻJVM���գ���Ϊ����Ȼ������
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
			//������ʱ ��ȡ��ǰ�̲߳������̸߳����µĴ���ʵ��
			if(time==3){
				Thread newThread = Thread.currentThread();
				newThread = new Thread(this);
				newThread.start();
			}
		}
	}

}
