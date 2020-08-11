package exercise;

class RP_ThreadEx13 {
	static long startTime = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RP_ThreadEx13_1 th1 = new RP_ThreadEx13_1();
		RP_ThreadEx13_2 th2 = new RP_ThreadEx13_2();
		
		th1.start();
		th2.start();
		
		startTime = System.currentTimeMillis();
		
		try{
			th1.join();
			th2.join();
		}catch(InterruptedException e){}
		System.out.println("소요시간 : " + (System.currentTimeMillis() - RP_ThreadEx13.startTime));
	}
}

class RP_ThreadEx13_1 extends Thread{
	public void run(){
		for(int i=0; i<300; i++){
			System.out.print("-");
		}
	} // run()
}

class RP_ThreadEx13_2 extends Thread{
	public void run(){
		for(int i=0; i<300; i++){
			System.out.print("|");
		}
	} // run()
}
