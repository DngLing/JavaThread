package com.dyf.exmple7;

public class Bank implements Runnable{

	int money  = 200;
	
	public void setMoney(int money){
		this.money = money;
	}
	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("Take")){
			//�÷�����"Take" �߳�ʹ��ʱ "Save"�̲߳���ʹ�������ǵȵ�������
			this.saveOrTake(300);
		}else if(Thread.currentThread().getName().equals("Save")){
			//ͬ��
			this.saveOrTake(150);
		}
		
	}
	
	//ʹ��synchronized ���θ÷������߳�ʹ�ø÷���ʱ����ѭ�߳�ͬ������
	public synchronized void saveOrTake(int amount){
		if(Thread.currentThread().getName().equals("Take")){
			for(int i=1;i<=3;i++){
				money-=amount/3;
				System.out.println("��"+i+"��ȡ���ֽ�"+amount/3+",�˻�ʣ��"+money+"Ԫ");
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
				System.out.println("��"+i+"�δ����ֽ�"+amount/3+",�˻�ʣ��"+money+"Ԫ");
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
