package exercise;

class RP121_Exercise12_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread th1 = new Thread(new RP121_Thread1());
		th1.start();
	}
}

class RP121_Thread1 implements Runnable{
	public void run(){
		for(int i=0; i<300; i++){
			System.out.print('-');
		}
	}
}

/*
class RP121_Thread1 extends Thread{
	public void run(){
		for(int i=0; i<300; i++){
			System.out.print('-');
		}
	}
}
*/