package exercise;


class RP725_A{
	public void method(RP725_B b){
		b.method();
	}
}

class RP725_B{
	public void method(){
		System.out.println("methodB()");
	}
}

class RP726_IFT {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RP725_A a = new RP725_A();
		a.method(new RP725_B());
	}

}
