package exercise;

public class ParameterTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PT2Data d = new PT2Data();
		PT2Data d2 = new PT2Data();
		
		d.x = 10;
		d2.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d);
		change(d2);
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);
		System.out.println("main() : x = " + d2.x);

	}
	
	static void change(PT2Data d){
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
	}

}

class PT2Data { int x; }