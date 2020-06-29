package exercise;

class SuperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child75 c = new Child75();
		c.method();

	}
}

class Parent75{
	int x = 10;
}

class Child75 extends Parent75{
	void method(){
		System.out.println("x=" + x);
		System.out.println("this.x = " + this.x);
		System.out.println("super.x=" + super.x);
	}
}
