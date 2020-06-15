package exercise;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = 7 + " ";
		String b = " " + 7;
		String c = 7 + "";
		String d = "" + 7;
		String e = "" + "";
		String f = 7 + 7 + "";
		String g = "" + 7 + 7;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		
		// 기본형과 참조형의 구별 없이 어떤 타입의 변수도 문자열과 덧셈연산을 수행하면 그 결과는 문자열이 된다.

	}

}
