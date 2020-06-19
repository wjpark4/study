package exercise;

public class OperatorEx22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;	// 계산 결과
		
		System.out.println(-8);
		// 8을 이진수 문자열로 변환
		System.out.println(Integer.toBinaryString(-8));
		System.out.println();
		
		temp = -8 << 1;
		System.out.println("-8 << 1 = " + temp);
		System.out.println(Integer.toBinaryString(temp));
		System.out.println();
		
		temp = -8 << 2;
		System.out.println("-8 << 2 = " + temp);
		System.out.println(Integer.toBinaryString(temp));
		System.out.println();
		
		System.out.println();
		System.out.println(-8);
		System.out.println(Integer.toBinaryString(-8));
		System.out.println();
		
		temp = -8 >> 1;
		System.out.println("-8 >> 1 = " + temp);
		System.out.println(Integer.toBinaryString(temp));
		System.out.println();
		
		temp = -8 >> 2;
		System.out.println("-8 >> 2 = " + temp);
		System.out.println(Integer.toBinaryString(temp));
		System.out.println();
		
		System.out.println();
		System.out.println(-8);
		System.out.println(Integer.toBinaryString(-8));
		System.out.println();
		
		temp = -8 >>> 1;
		System.out.println("-8 >>> 1 = " + temp);
		System.out.println(Integer.toBinaryString(temp));
		System.out.println();
		
		temp = -8 >>> 2;
		System.out.println("-8 >>> 2 = " + temp);
		System.out.println(Integer.toBinaryString(temp));
		System.out.println();
		

	}

}
