package exercise;

import java.util.Scanner;

public class Baek_1978_Re {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		
		int[] num = new int[test_case];
		int p_count = 0;
		
		for(int i=0; i<test_case; i++){
			num[i] = sc.nextInt();
			if(prime(num[i])){
				p_count++;
			}
		}
		
		System.out.println(p_count);
		
	}
	
	static boolean prime(int n){
		if(n < 2) return false;
		for(int i=2; i*i <= n; i++){
			if(n%i == 0) return false;
		}
		return true;
	}
}
