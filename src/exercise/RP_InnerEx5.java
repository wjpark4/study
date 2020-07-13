package exercise;

class Outer_RP105{
	int value=10;
	
	class Inner_RP105{
		int value=20;
		void method1(){
			int value=30;
			System.out.println("           value : " + value);
			System.out.println("      this.value : " + this.value);
			System.out.println("Outer.this.value : " + Outer_RP105.this.value);
		}
	}
}
class RP_InnerEx5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer_RP105 outer = new Outer_RP105();
		Outer_RP105.Inner_RP105 inner = outer.new Inner_RP105();
		inner.method1();

	}
}
