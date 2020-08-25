package exercise;

class Exercise12_5 {
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Thread125 th1 = new Thread125();
		th1.start();
		
		try{
			Thread.sleep(5*1000);
		}catch(Exception e){}
		
		throw new Exception("²Î~!!!");
	}
}

class Thread125 extends Thread{
	public void run(){
		for(int i=0; i<10; i++){
			System.out.println(i);
			
			try{
				Thread.sleep(1000);
			}catch(Exception e){}
		}
	}
}