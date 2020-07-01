package exercise;

public class RP719_BindingTest3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RP719_Parent p = new RP719_Child();
		RP719_Child c = new RP719_Child();
		
		System.out.println("p.x = " + p.x);
		p.method();
		System.out.println();
		System.out.println("c.x = " + c.x);
		c.method();
	}
}

class RP719_Parent{
	int x = 100;
	
	void method(){
		System.out.println("Parent Method");
	}
}

class RP719_Child extends RP719_Parent{
	int x = 200;
	
	void method(){
		System.out.println("x=" + x);
		System.out.println("super.x=" + super.x);
		System.out.println("this.x=" + this.x);
	}
}
