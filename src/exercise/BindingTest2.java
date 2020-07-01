package exercise;

class BindingTest2 {

	public static void main(String[] args) {
		Parent718 p = new Child718();
		Child718 c = new Child718();
		
		System.out.println("p.x = " + p.x);
		p.method();
		
		System.out.println("c.x = " + c.x);
		c.method();
	}
}

class Parent718{
	int x=100;
	
	void method(){
		System.out.println("Parent Method");
	}
}

class Child718 extends Parent718{}