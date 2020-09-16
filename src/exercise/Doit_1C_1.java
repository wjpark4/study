package exercise;

import java.util.Scanner;

class Doit_1C_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("세 정수의 중앙값을 구합니다.");
		
		int a = stdIn.nextInt();
		System.out.print("a의 값 : " + a);
		
		int b = stdIn.nextInt();
		System.out.print("b의 값 : " + b);
		
		int c = stdIn.nextInt();
		System.out.print("c의 값 : " + c);
		
		System.out.println("중앙값은 " + med3(a, b, c) + "입니다.");
	}
	
	static int med3(int a, int b, int c){
		if(a >= b){
			if(b >= c) return b;
			if(a <= c) return a;
			return c;
		} else if(a > c){
			return a;
		} else if(b > c){
			return c;
		} else
			return b;
	}// int med3

}
