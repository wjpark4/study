package exercise;

public class ParameterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PTData d = new PTData();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);

	}
	
	static void change(int x){
		x = 1000;
		System.out.println("change() : x = " + x);
	}

}

class PTData { int x; }