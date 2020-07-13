package exercise;

class Outer_RP102{
	static class Inner_RP102{
		int iv=200;
	}
}
class RP_Exercise10_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer_RP102.Inner_RP102 inner = new Outer_RP102.Inner_RP102();
		System.out.println(inner.iv);

	}
}
