package exercise;

class RP_ThreadEx22 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RP1222_Data d = new RP1222_Data();
		RP1222_MyThreadEx22 t1 = new RP1222_MyThreadEx22(d);
		RP1222_MyThreadEx22 t2 = new RP1222_MyThreadEx22(d);
		
		t1.start();
		t2.start();

	}
}


class RP1222_Data{
	int iv = 0;
}

class RP1222_MyThreadEx22 extends Thread{
	RP1222_Data d;
	
	RP1222_MyThreadEx22(RP1222_Data d){
		this.d = d;
	}
	
	public void run(){
		int lv = 0;
		
		while(lv < 3){
			System.out.println(getName() + " Local Var : " + ++lv);
			System.out.println(getName() + " Instance Var : " + ++d.iv);
			System.out.println();
		}
	}
}