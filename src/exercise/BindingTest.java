package exercise;

class BindingTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent717 p = new Child717();
		Child717 c = new Child717();
		
		System.out.println("p.x = " + p.x);
		p.method();
		
		System.out.println("c.x = " + c.x);
		c.method();
	}
}


class Parent717{
	int x = 100;
	
	void method(){
		System.out.println("Parent Method");
	}
}

class Child717 extends Parent717{
	int x = 200;
	
	void method(){
		System.out.println("Child Method");
	}
}