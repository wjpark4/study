package exercise;

import java.util.Scanner;

public class Baek_1476_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int E = sc.nextInt()-1;	// 0~14
		int S = sc.nextInt()-1; // 0~27
		int M = sc.nextInt()-1; // 0~18
		
		for(int i=0; ;i++){
			if((i%15==E) && (i%28==S) && (i%19==M)){
				System.out.println(i+1);
				break;
			}
		}
	}
}
