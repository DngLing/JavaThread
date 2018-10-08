package com.dyf.exmple6;
  
public class Classroom implements Runnable {

	//��������������߳�
	public Thread teacher;
	public Thread student;
	
	public Classroom(){
		teacher = new Thread(this);
		student = new Thread(this);
		teacher.start();
		student.start();
	} 
	@Override
	public void run() {
		//student�߳̽�����1��Сʱ
		if(Thread.currentThread() == student){
			System.out.println("ѧ���߳̽�������");
			try {
				Thread.sleep(1000*60*60);
			} catch (InterruptedException e) {
				System.out.println("student �߳̽������ߣ�������");
				e.printStackTrace();
			}
			System.out.println("ѧ���߳̿�ʼ����");
		}
		else if(Thread.currentThread()==teacher){
			for(int i=3;i>=1;i--){
				System.out.println("��ʦ����"+i+"�����ѧ���߳�");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			//teacher�̻߳������ߵ�student�߳�
			this.student.interrupt();
		}	
	}
}
