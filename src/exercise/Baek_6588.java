package exercise;

import java.util.Scanner;

public class Baek_6588 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input;
		int test_case = 100000;
		while(test_case-- > 0){
			input = sc.nextInt();
			if(input == 0) break;
			out_gold(input);
		}
	}
	
	static void out_gold(int n){
		int[] prime = new int[n];
		int pc = 0;
		boolean[] check = new boolean[n+1];	// 소수가 아닌 수는 지운다.
		
		for(int i=2; i<=n; i++){
			if(check[i] == false){
				prime[pc++] = i;
				for(int j=i+i; j<=n; j+=i){
					check[j] = true;
				}
			}
		} // 여기까지가 에라토스테네스의 채로 소수를 걸러냈다.
		
		for(int i=0; i<=pc-1; i++){
			if(i==(pc-1)){
				System.out.println("Goldbach's conjecture is wrong");
			}
			
			if((prime[i]%2) != 0){
				for(int j=i+1; j<=pc-1; j++){
					if((prime[i] + prime[j]) == n){
						System.out.println(n + " = " + prime[i] + " + " + prime[j]);
						return;
					}
				}
			}
		} // 소수합 판별
		
		
	}
}
