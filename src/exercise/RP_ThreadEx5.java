package exercise;

class RP_ThreadEx5 {
	static long startTime = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RP_ThreadEx5_1 th1 = new RP_ThreadEx5_1();
		th1.start();
		startTime = System.currentTimeMillis();
		
		for(int i=0; i<300; i++){
			System.out.print("-");
		}
		System.out.print("소요시간1: " + (System.currentTimeMillis()-RP_ThreadEx5.startTime));
	}
}

class RP_ThreadEx5_1 extends Thread{
	public void run(){
		for(int i=0; i<300; i++){
			System.out.print("|");
		}
		
		System.out.print("소요시간2 : " + (System.currentTimeMillis()-RP_ThreadEx5.startTime));
	}
}