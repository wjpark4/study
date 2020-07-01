package exercise;

public class RPBindingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RP717Parent p = new RP717Child();
		RP717Child c = new RP717Child();
		
		System.out.println("p.x = " + p.x);
		//System.out.println("p.b = " + p.b);
		p.method();
		
		System.out.println("c.x = " + c.x);
		//System.out.println("c.b = " + c.b);
		c.method();
	}
}

class RP717Parent{
	int x = 100;
	static int b =10;
	
	void method(){
		System.out.println("Parent Method");
	}
}

class RP717Child extends RP717Parent{
	int x = 200;
	static int b = 20;
	void method(){
		System.out.println("Child Method");
	}
}