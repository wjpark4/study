package exercise;

class ThreadEx3 {
	public static void main(String[] args) {
		// TODO Auto-generated ethod stub
		MyThreadEx3_1 t1 = new MyThreadEx3_1();
		t1.run();
	}
}

class MyThreadEx3_1 extends Thread{
	public void run(){
		throwException();
	}
	
	public void throwException(){
		try{
			throw new Exception();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}