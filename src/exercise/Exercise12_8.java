package exercise;

class Exercise12_8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread128_1 th1 = new Thread128_1();
		Thread128_2 th2 = new Thread128_2();
		
		th1.start();
		th2.start();
	}
}

class Thread128_1 extends Thread{
	public void run(){
		for(int i=0; i<300; i++){
			System.out.print('-');
			yield();
		}
	}
}

class Thread128_2 extends Thread{
	public void run(){
		for(int i=0; i<300; i++){
			System.out.print('|');
			yield();
		}
	}
}