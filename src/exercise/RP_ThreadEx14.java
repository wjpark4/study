package exercise;

class RP_ThreadEx14 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEx14_1 th1 = new ThreadEx14_1();
		ThreadEx14_2 th2 = new ThreadEx14_2();
		
		th1.start();
		
		try{
			th1.join();
		}catch(InterruptedException e){}
		th2.start();
	}
}

class RP_ThreadEx14_1 extends Thread{
	public void run(){
		for(int i=0; i<300; i++){
			System.out.print("-");
		}
	}
}

class RP_ThreadEx14_2 extends Thread{
	public void run(){
		for(int i=0; i<300; i++){
			System.out.print("|");
		}
	}
}