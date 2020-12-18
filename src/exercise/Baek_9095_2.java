package exercise;

import java.util.*;

public class Baek_9095_2 {
	static int cnt = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		while(test_case-- > 0){
			int n = sc.nextInt();
			
			System.out.println(n_of_method(n));
			cnt = 0;
		}
	}
	
	static int n_of_method(int n){
		
		for(int i=1; i<= 3; i++){
			if(i < n){
				n_of_method(n-i);
			} else if(i == n){
				//++cnt;
				cnt += 1;
			} else{
				break;
			}
		}
		return cnt;
		
		/*
		for(int i=1; i<=3; i++){
			if(i > n) break;
			if(i==n) {
				cnt += 1;	
			} else{
				n_of_method(n-i);
			}
		}
		return cnt;
		*/
	}
	
	
}
