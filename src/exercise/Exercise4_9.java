package exercise;

public class Exercise4_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "12345";
		int sum = 0;
		int ch=' ';
		for(int i=0; i<str.length(); i++){
			ch = str.charAt(i)-'0';
			sum += ch;
			
		}
		System.out.println("sum=" + sum);

	}

}
