package exercise;

import java.util.Scanner;

public class Baek_6588_Re {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input;
		int test_case = 1000000;
		boolean escape = false;		// 이중 루프 탈출
		
		int[] prime = new int[test_case];	// 10만개의 에레스토테네스의 채를 미리 만든다.
		int pc = 0;
		boolean[] check = new boolean[test_case+1];	// 소수가 아닌 수는 지운다.
		
		for(int i=2; i<=test_case; i++){
			if(check[i] == false){
				prime[pc++] = i;
				for(int j=i+i; j<=test_case; j+=i){
					check[j] = true;
				}
			}
		} // 여기까지가 에라토스테네스의 채로 소수를 걸러냈다.
		
		
		while(test_case-- > 0){
			input = sc.nextInt();
			if(input == 0) break;
			
			// 골드바흐 시작
			
			for(int i=0; i<=pc-1; i++){
				if(i==(pc-1)){
					System.out.println("Goldbach's conjecture is wrong");
				}
				
				if((prime[i]%2) != 0){
					for(int j=i+1; j<=pc-1; j++){
						if((prime[i] + prime[j]) == input){
							System.out.println(input + " = " + prime[i] + " + " + prime[j]);
							escape = true;
							break;
						}
					}
					if(escape){
						escape = false;
						break;
					}
					
				}
			} // 소수합 판별
			
			// 골드바흐 끝
			
			
		} // while문
	} // main함수
	
	
}
