package exercise;

class RP_ThreadEx2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RP_MyThreadEx2_1 t1 = new RP_MyThreadEx2_1();
		t1.start();
	}
}

class RP_MyThreadEx2_1 extends Thread{
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