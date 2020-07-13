package exercise;

class Outer105{
	int value=10;
	
	class Inner105{
		int value=20;
		void method1(){
			int value=30;
			System.out.println("           value : " + value);
			System.out.println("      this.value : " + this.value);
			System.out.println("Outer.this.value : " + Outer105.this.value);
		}
	}
}


class InnerEx5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer105 outer = new Outer105();
		Outer105.Inner105 inner = outer.new Inner105();
		inner.method1();
	}
}
