package exercise;

class Outer_RP101{
	class Inner_RP101{
		int iv=100;
	}
}

class RP_Exercise10_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer_RP101 outer = new Outer_RP101();
		Outer_RP101.Inner_RP101 inner = outer.new Inner_RP101();
		System.out.println(inner.iv);

	}
}
