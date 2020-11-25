package exercise;

import java.util.Scanner;

public class Baek_1929 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] input = new int[2];
		
		input[0] = sc.nextInt();
		input[1] = sc.nextInt();
		prime(input[0], input[1]);
		
	}
	
	static void prime(int m, int n){
		int[] prime = new int[n];
		int pn = 0;
		boolean[] check = new boolean[n+1];
		
		for(int i=2; i<=n; i++){
			if(check[i] == false){
				prime[pn++] = i;
				for(int j=i+i; j<=n; j+=i){
					check[j] = true;
				}
			}
		} // for문
		
		for(int i=0; i<=pn; i++){
			if(prime[i] >= m)
				System.out.println(prime[i]);
		}
	}
}
