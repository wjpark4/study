package exercise;

class Exercise12_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread122 t1 = new Thread122();
		t1.run();
		
		for(int i=0; i<10; i++)
			System.out.print(i);
	}
}


class Thread122 extends Thread{
	public void run(){
		for(int i=0; i<10; i++){
			System.out.print(i);
		}
	}
}
