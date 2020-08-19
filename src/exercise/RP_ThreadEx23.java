package exercise;

class RP_ThreadEx23 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RP_MyThreadEx23 t1 = new RP_MyThreadEx23();
		RP_MyThreadEx23 t2 = new RP_MyThreadEx23();
		
		t1.start();
		t2.start();
	}
}

class RP_MyThreadEx23 extends Thread{
	int iv = 0;
	
	public void run(){
		int lv = 0;
		
		while(lv < 3){
			System.out.println(getName() + " Local Var : " + ++lv);
			System.out.println(getName() + " Instance Var : " + ++iv);
			System.out.println();
		}
	}
}