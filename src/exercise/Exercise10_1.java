package exercise;

class Outer_E101{
	class Inner_E101{
		int iv=100;
	}
}

class Exercise10_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer_E101 outer = new Outer_E101();
		Outer_E101.Inner_E101 inner = outer.new Inner_E101();
		
		System.out.println(inner.iv);
	}
}
