package exercise;

class RP_ThreadEx15 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RP_ThreadEx15_1 th1 = new RP_ThreadEx15_1();
		RP_ThreadEx15_2 th2 = new RP_ThreadEx15_2();
		
		th1.start();
		th2.start();
		
		try{
			th1.sleep(5000);
		}catch(InterruptedException e){}
		
		System.out.print("<<main 종료>>");
	}
}

class RP_ThreadEx15_1 extends Thread{
	public void run(){
		for(int i=0; i<300; i++){
			System.out.print("-");
		}
		System.out.print("<<th1 종료>>");
	}
}

class RP_ThreadEx15_2 extends Thread{
	public void run(){
		for(int i=0; i<300; i++){
			System.out.print("|");
		}
		System.out.print("<<th2 종료>>");
	}// run()
}