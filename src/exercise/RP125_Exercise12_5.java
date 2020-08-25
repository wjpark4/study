package exercise;

class RP125_Exercise12_5 {
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		RP125_Thread3 th1 = new RP125_Thread3();
		th1.start();
		
		try{
			Thread.sleep(5 * 1000);
		}catch(Exception e){}
		
		throw new Exception("²Î~!!!");
	}
}

class RP125_Thread3 extends Thread{
	public void run(){
		for(int i=0; i<10; i++){
			System.out.println(i);
			
			try{
				Thread.sleep(1000);
			}catch(Exception e){}
		}
	}
}