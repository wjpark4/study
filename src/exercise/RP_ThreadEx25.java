package exercise;

class RP_ThreadEx25 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = new RunnableEx101();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
	}
}

class RP1125_Account{
	int balance = 1000;
	
	public synchronized void withdraw(int money){
		if(balance >= money){
			try{ Thread.sleep(1000);}catch(Exception e){}
		}
	} // withdraw
}

class RP1125_RunnableEx101 implements Runnable{
	RP1125_Account acc = new RP1125_Account();
	
	public void run(){
		while(acc.balance > 0){
			int money = (int)(Math.random() * 3 + 1) * 100;
			acc.withdraw(money);
			System.out.println("balance : " + acc.balance);
		}
	}
}