package exercise;

import java.util.Scanner;

public class Baek_1929_Re {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int[] prime = new int[N];	// 소수를 저장할 변수
		int pn = 0;					// 소수의 개수
		boolean[] check = new boolean[N+1];
		
		for(int i=2; i<=N; i++){
			if(check[i] == false){
				prime[pn++] = i;
				for(int j=i+i; j<=N; j+=i){
					check[j] = true;
				}
			}
		}
		for(int i=0; i<pn; i++){
			if(prime[i] >= M)
				System.out.println(prime[i]);
		}
	}
}
