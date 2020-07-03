package exercise;

class Exercise7_20 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent_E720 p = new Child_E720();
		Child_E720 c = new Child_E720();
		
		System.out.println("p.x = " + p.x);
		p.method();
		
		System.out.println("c.x = " + c.x);
		c.method();
	}
}


class Parent_E720{
	int x = 100;
	
	void method(){
		System.out.println("Parent Method");
	}
}

class Child_E720 extends Parent_E720{
	int x = 200;
	
	void method(){
		System.out.println("Child Method");
	}
}