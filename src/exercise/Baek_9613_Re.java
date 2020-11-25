package exercise;

import java.util.Scanner;

public class Baek_9613_Re {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		
		while(test_case > 0){
			test_case--;
			int num = sc.nextInt();
			int[] input = new int[num];
			
			for(int i=0; i<num; i++){
				input[i] = sc.nextInt();
			}
			
			int total = 0;
			
			for(int i=0; i<num-1; i++){
				for(int j=i+1; j<num; j++){
					total += gcd(input[i], input[j]);
				}
			}
			System.out.println(total);
		}
	}
	
	static int gcd(int a, int b){
		if( b == 0) return a;
		return gcd(b, a%b);
	}
}
