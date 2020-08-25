package exercise;

class RP126_Exercise12_6 {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		RP126_Thread4 th1 = new RP126_Thread4();
		th1.setDaemon(true);
		th1.start();
		
		try{
			th1.sleep(5*1000);
		}catch(Exception e){}
		
		throw new Exception("²Î~!!!");
	}
}

class RP126_Thread4 extends Thread{
	public void run(){
		for(int i=0; i<10; i++){
			System.out.println(i);
			
			try{
				Thread.sleep(1000);
			}catch(Exception e){}
		}
	}
}