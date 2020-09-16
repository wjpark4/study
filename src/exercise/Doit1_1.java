package exercise;

import java.util.Scanner;

class Doit1_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		
		System.out.println("세 정수의 최대값을 구한다.");
		System.out.println("a의 값 : ");
		int a = stdIn.nextInt();
		
		System.out.println("b의 값 : ");
		int b = stdIn.nextInt();
		
		System.out.println("c의 값 : ");
		int c = stdIn.nextInt();
		
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		
		System.out.println("최대값 : " + max);
	}
}
