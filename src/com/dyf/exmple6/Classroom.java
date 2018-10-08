package com.dyf.exmple6;
  
public class Classroom implements Runnable {

	//弱耦合两个代理线程
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
		//student线程将休眠1个小时
		if(Thread.currentThread() == student){
			System.out.println("学生线程进入休眠");
			try {
				Thread.sleep(1000*60*60);
			} catch (InterruptedException e) {
				System.out.println("student 线程结束休眠，被唤醒");
				e.printStackTrace();
			}
			System.out.println("学生线程开始处理");
		}
		else if(Thread.currentThread()==teacher){
			for(int i=3;i>=1;i--){
				System.out.println("老师将在"+i+"秒后唤醒学生线程");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			//teacher线程唤醒休眠的student线程
			this.student.interrupt();
		}	
	}
}
