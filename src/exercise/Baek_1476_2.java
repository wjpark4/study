package exercise;

import java.util.Scanner;

public class Baek_1476_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int e = sc.nextInt()-1;
		int s = sc.nextInt()-1;
		int m = sc.nextInt()-1;
		for(int i=0;; i++){
			if(i%15 == e && i%28 == s && i % 19 == m){
				System.out.println(i+1);
				System.out.println();
				System.out.println(i%15);
				System.out.println(i%28);
				System.out.println(i%19);
				break;
			}
		}
	}
}
