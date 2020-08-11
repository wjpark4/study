package exercise;

class RP_ThreadEx3 {
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		RP_MyThreadEx3_1 t1 = new RP_MyThreadEx3_1();
		t1.run();
	}
}

class RP_MyThreadEx3_1 extends Thread{
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