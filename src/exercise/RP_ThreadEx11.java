package exercise;

class RP_ThreadEx11 implements Runnable{
	static boolean autoSave = false;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new ThreadEx11());
		t.setDaemon(true);
		t.start();
		
		for(int i=1; i<=20; i++){
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){}
			System.out.println(i);
			
			if(i==5)
				autoSave = true;
		}
		
		System.out.println("프로그램을 종료합니다.");

	}
	
	public void run(){
		while(true){
			try{
				Thread.sleep(3*1000);			// 3초마다
			}catch(InterruptedException e){}
			
			// autoSave의 값이 true이면 autoSave()를 호출한다.
			if(autoSave){
				autoSave();
			}
		}
	}// run
	
	public void autoSave(){
		System.out.println("작업파일이 자동저장되었습니다.");
	}
}
