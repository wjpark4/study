package exercise;

class Exercise12_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = new Thread121();
		Thread th1 = new Thread(r);
		
		th1.start();
	}
}


class Thread121 implements Runnable{
	public void run(){
		for(int i=0; i<300; i++){
			System.out.print('-');
		}
	}
}


/*
class Thread121 extends Thread{
	public void run(){
		for(int i=0; i<300; i++){
			System.out.print('-');
		}
	}
}
*/