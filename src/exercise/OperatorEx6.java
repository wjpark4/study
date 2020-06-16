package exercise;

public class OperatorEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 10;
		// byte result = ~b;
		// byte, short, char 형은 int형으로 변환된 후에 전환된다.
		byte result = (byte) ~b;
		
		System.out.println("b = " + b);
		System.out.println("~b = " + result);

	}

}
