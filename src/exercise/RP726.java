package exercise;

class A_RP726{
	public void methodA(B_RP726 b){
		b.methodB();
	}
}

class B_RP726{
	public void methodB(){
		System.out.println("methodB()");
	}
}

class RP726 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A_RP726 a = new A_RP726();
		a.methodA(new B_RP726());
	}
}
