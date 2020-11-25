package exercise;

import java.util.Scanner;

public class Baek_1934 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int i=0;
		int a, b;
		
		while(i < input){
			a = sc.nextInt();
			b = sc.nextInt();
			
			System.out.println(lcm(a, b));
			i++;
		}
	}
	
	static int gcd(int a, int b){
		while(b != 0){
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
	
	static int lcm(int a, int b){
		int g = gcd(a, b);
		return g * a / g * b / g;
	}
}
