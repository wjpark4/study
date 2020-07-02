package exercise;

class A726{
	public void methodA(B726 b){
		b.methodB();
	}
}

class B726{
	public void methodB(){
		System.out.println("methodB()");
	}
}

class InterfaceTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A726 a = new A726();
		a.methodA(new B726());
	}
}
