package exercise;

class Exercise12_7 {
	static boolean stopped = false;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread127 th1 = new Thread127();
		th1.start();
		
		try{
			Thread.sleep(6*1000);
		}catch(Exception e){}
		
		stopped = true;					// �����带 ������Ų��.
		th1.interrupt();
		System.out.println("stopped");
	}
}

class Thread127 extends Thread{
	public void run(){
		// Exercise12_7. stopped�� ���� false��  ���� �ݺ��Ѵ�.
		for(int i=0; !Exercise12_7.stopped; i++){
			System.out.println(i);
			
			try{
				Thread.sleep(3*1000);
			}catch(Exception e){}
		}
	}
}