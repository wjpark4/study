package exercise;

import java.util.Scanner;

public class Baek_9095 {
	static int ans = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		//static int ans = 0;
		while(test_case-->0){
			System.out.println(n_of_method(sc.nextInt()));
			ans = 0;
		}
	}
	
	static int n_of_method(int num){
		for(int i=1; i<=3; i++){
			if(i > num) break;
			if(i==num) {
				ans += 1;	
			} else{
				n_of_method(num-i);
			}
		}
		return ans;
		
	} // n of method
}
