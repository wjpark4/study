package exercise;

class RPBindingTest2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RP718_Parent p = new RP718_Child();
		RP718_Child c = new RP718_Child();
		
		System.out.println("p.x = " + p.x);
		p.method();
		
		System.out.println("c.x = " + c.x);
		c.method();
	}
}

class RP718_Parent{
	int x = 100;
	
	void method(){
		System.out.println("Parent Method");
	}
}

class RP718_Child extends RP718_Parent{}
