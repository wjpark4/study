package exercise;

import java.util.Scanner;

public class Baek_1476 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int E = sc.nextInt();
		int S = sc.nextInt();
		int M = sc.nextInt();
		
		int e, s, m;
		e = s = m = 1;
		
		for(int i=1; ; i++){
			if(E == e && S == s && M == m){
				System.out.println(i);
				break;
			}
			
			e += 1;
			s += 1;
			m += 1;
			if(e == 16) e=1;
			if(s == 29) s=1;
			if(m == 20) m=1;
			
		}
		
		
		
	}
}
