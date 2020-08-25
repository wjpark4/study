package exercise;

class RP122_Exercise12_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RP122_Thread2 t1 = new RP122_Thread2();
		t1.run();
		
		for(int i=0; i<10; i++)
			System.out.print(i);
	}
}

class RP122_Thread2 extends Thread{
	public void run(){
		for(int i=0; i<10; i++)
			System.out.print(i);
	}
}