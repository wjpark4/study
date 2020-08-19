package exercise;

class RP_ThreadEx24 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = new RP1224_RunnableEx24();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
	}
}

class RP1224_Account{
	int balance = 1000;
	
	public void withdraw(int money){
		if(balance >= money){
			try{ Thread.sleep(1000); } catch(Exception e){}
			balance -= money;
		}
	} // withdraw
}

class RP1224_RunnableEx24 implements Runnable{
	RP1224_Account acc = new RP1224_Account();
	
	public void run(){
		while(acc.balance > 0){
			// 100, 200, 300중의 한 값을 임의로 선택해서 출금(withdraw)
			int money = (int)(Math.random() * 3 + 1) *100;
			acc.withdraw(money);
			System.out.println("balance : " + acc.balance);
		}
	} // run()
}