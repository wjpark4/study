package exercise;

import java.util.Scanner;

public class Baek_1978 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int test_case = sc.nextInt();		// 입력할 숫자의 수
		int p_count=0;						// 소수의 개수
		
		int[] num = new int[test_case];
		
		for(int i=0; i<test_case; i++){
			num[i] = sc.nextInt();
			if(prime(num[i])){
				p_count++;
			}
		} // for문		
		System.out.println(p_count);
	}
	
	static boolean prime(int n){
		if(n < 2)
			return false;
		for(int i=2; i*i<=n; i++){
			if(n % i == 0)
				return false;
		}
		return true;
	}
	
	
}
