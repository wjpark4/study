package exercise;

class RP127_Exercise12_7 {
	static boolean stopped = false;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		RP127_Thread5 th1 = new RP127_Thread5();
		th1.start();
		
		try{
			Thread.sleep(6*1000);
		}catch(Exception e){}
		
		stopped = true;			// 쓰레드를 정지시킨다.
		th1.interrupt();
		System.out.println("stopped");
	}
}


class RP127_Thread5 extends Thread{
	public void run(){
		// Exercise12_7.stopped의 값이 false인 동안 반복한다.
		for(int i=0; !RP127_Exercise12_7.stopped; i++){
			System.out.println(i);
			
			try{
				Thread.sleep(3*1000);
			}catch(Exception e){}
		}
	}
}