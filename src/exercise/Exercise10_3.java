package exercise;

class Outer_E103{
	int value=10;
	
	class Inner_E103{
		int value=20;
		void method1(){
			int value=30;
			System.out.println("           value : " + value);
			System.out.println("      this.value : " + this.value);
			System.out.println("Outer.this.value : " + Outer_E103.this.value);
		}
	}
}
class Exercise10_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer_E103 outer = new Outer_E103();
		Outer_E103.Inner_E103 inner = outer.new Inner_E103();
		inner.method1();

	}
}
