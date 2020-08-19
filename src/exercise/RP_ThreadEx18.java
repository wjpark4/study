package exercise;

class RP_ThreadEx18 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RP_MyThreadEx18 th1 = new RP_MyThreadEx18("*");
		RP_MyThreadEx18 th2 = new RP_MyThreadEx18("**");
		RP_MyThreadEx18 th3 = new RP_MyThreadEx18("***");
		th1.start();
		th2.start();
		th3.start();
		
		try{
			Thread.sleep(2000);
			th1.suspend();
			Thread.sleep(2000);
			th2.suspend();
			Thread.sleep(3000);
			th1.resume();
			Thread.sleep(3000);
			th1.stop();
			th2.stop();
			Thread.sleep(2000);
			th3.stop();
		}catch(InterruptedException e){}

	}
}

class RP_MyThreadEx18 implements Runnable{
	boolean suspended = false;
	boolean stopped = false;
	
	Thread th;
	
	RP_MyThreadEx18(String name){
		th = new Thread(this, name);		// Thread(Runnable r, String name)
	}
	
	public void run(){
		while(!stopped){
			if(!suspended){
				System.out.println(Thread.currentThread().getName());
				try{
					Thread.sleep(1000);
				}catch(InterruptedException e){}
			}
		}
		System.out.println(Thread.currentThread().getName() + " - stopped");
	}
	
	public void suspend(){
		suspended = true;
	}
	
	public void resume(){
		suspended = false;
	}
	
	public void stop(){
		stopped = true;
	}
	
	public void start(){
		th.start();
	}
}