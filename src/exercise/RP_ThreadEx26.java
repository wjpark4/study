package exercise;

class RP_ThreadEx26 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RP1126_MyThreadEx26 th1 = new RP1126_MyThreadEx26("*");
		RP1126_MyThreadEx26 th2 = new RP1126_MyThreadEx26("**");
		RP1126_MyThreadEx26 th3 = new RP1126_MyThreadEx26("***");
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
			th2.resume();
			th2.stop();
			Thread.sleep(2000);
			th3.stop();
		}catch(InterruptedException e){}

	}
}

class RP1126_MyThreadEx26 implements Runnable{
	static final int RUNNING = 0;
	static final int SUSPENDED = 1;
	static final int STOPPED = 2;
	
	private int state = RUNNING;
	Thread th;
	
	RP1126_MyThreadEx26(String name){
		th = new Thread(this, name);	// Thread(Runnable r, String name)
	}
	
	public synchronized void setState(int state){
		this.state = state;
		
		// state�� SUSPENDED���ٰ� RUNNING���� ����Ǹ�, notify()�� ȣ���Ѵ�.
		if(state==RUNNING){
			notify();
		}else{
			th.interrupt();
		}
	}
	
	public synchronized boolean checkState(){
		// state�� SUSPENDED�� wait()�� ȣ���ؼ� �����带 �����·� �����,
		while(state == SUSPENDED){
			try{
				wait();
			}catch(InterruptedException e){}
		}
		// state�� STOPPED�̸� true��, �� �ܿ��� false�� �����Ѵ�.
		return state==STOPPED;
	}
	
	public void run(){
		String name = Thread.currentThread().getName();
		
		while(true){
			System.out.println(name);
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){}
			
			// state�� STOPPED�̸� checkstate()�� true�� ��ȯ�ؼ� while���� ����� �ȴ�.
			if(checkState()){
				break;
			}
		} // while��
		System.out.println(name + " - END");
	} // run()
	
	public void suspend(){
		setState(SUSPENDED);
	}
	
	public void resume(){
		setState(RUNNING);
	}
	
	public void stop(){
		setState(STOPPED);
	}
	
	public void start(){
		th.start();
	}
}
