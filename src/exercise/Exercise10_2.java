package exercise;


class Outer_E102{
	static class Inner_E102{
		int iv=200;
	}
}

class Exercise10_2 {
	public static void main(String[] args) {
		Outer_E102 outer = new Outer_E102();
		Outer_E102.Inner_E102 inner = new Outer_E102.Inner_E102();
		System.out.println(inner.iv);
	}
}