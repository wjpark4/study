package exercise;

class RP_ThreadEx1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RP_ThreadEx1_1 t1 = new RP_ThreadEx1_1();
		
		Runnable r = new RP_ThreadEx1_2();
		Thread t2 = new Thread(r);		// ������ Thread(Runnable target)
		
		t1.start();
		t2.start();
	}
}

class RP_ThreadEx1_1 extends Thread{
	public void run(){
		for(int i=0; i<5; i++){
			System.out.println(getName());		// ������ Thread�� getName()�� ȣ��
		}
	}
}

class RP_ThreadEx1_2 implements Runnable{
	public void run(){
		for(int i=0; i<5; i++){
			// Thread.currentThread() - ���� �������� Thread�� ��ȯ�Ѵ�.
			System.out.println(Thread.currentThread());
		}
	}
}