package exercise;

class SuperTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child76 c = new Child76();
		c.method();
	}
}

class Parent76{
	int x=10;
}

class Child76 extends Parent76{
	int x=20;
	
	
	void method(){
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);
		System.out.println("super.x=" + super.x);
	}
	
}
