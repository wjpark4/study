package exercise;

class Outer_RP103{
	int value=10;
	
	class Inner_RP103{
		int value=20;
		void method1(){
			int value=30;
			
			System.out.println(value);
			System.out.println(this.value);
			System.out.println(Outer_RP103.this.value);
		}
	}
}
class RP_Exercise10_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer_RP103 outer = new Outer_RP103();
		Outer_RP103.Inner_RP103 inner = outer.new Inner_RP103();
		inner.method1();

	}
}
