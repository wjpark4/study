package exercise;

class RP128_Exercise12_8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RP128_Thread6_1 th1 = new RP128_Thread6_1();
		RP128_Thread6_2 th2 = new RP128_Thread6_2();
		
		th1.start();
		th2.start();
	}
}

class RP128_Thread6_1 extends Thread{
	public void run(){
		for(int i=0; i<300; i++){
			System.out.print('-');
			yield();
		}
	}
}

class RP128_Thread6_2 extends Thread{
	public void run(){
		for(int i=0; i<300; i++){
			System.out.print('|');
			yield();
		}
	}
}