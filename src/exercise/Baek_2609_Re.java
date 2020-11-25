package exercise;

import java.util.Scanner;

public class Baek_2609_Re {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] input = new int[2];
		input[0] = sc.nextInt();
		input[1] = sc.nextInt();
		
		System.out.println(gcd(input[0], input[1]));
		System.out.println(lcm(input[0], input[1]));
	}
	
	static int gcd(int a, int b){
		if(b == 0){
			return a;
		} 
		
		return gcd(b, a%b);
	}
	
	static int lcm(int a, int b){
		return a*b/gcd(a,b);
	}
}
