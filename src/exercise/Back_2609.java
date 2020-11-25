package exercise;

import java.util.Scanner;

public class Back_2609 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(gcd(a, b));
		System.out.println(lcm(a, b));
	}
	
	static int gcd(int a, int b){
		if(b == 0) return a;
		
		int r = a % b;
		return gcd(b, r);
	}
	
	static int lcm(int a, int b){
		int g = gcd(a, b);
		return g*a/g*b/g;
	}
}
