package exercise;

import java.util.*;

public class Baek_1759 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		// 몇개의 문자로 조합을 할건가 L
		int m = sc.nextInt();		// 주어진 문자 C
		// 그리고 1개이상의 모음과 2개이상의 자음으로 이루어져야 함. 오름차순이어야 함
		String[] alpha = new String[m];
		
		for(int i=0; i<m; i++){
			alpha[i] = sc.next();
		}
		Arrays.sort(alpha);
		go(4, alpha, "", 0);
		
	}
	
	// 정렬하는 메소드
	public static void go(int n, String[] alpha, String password, int i){
		if(password.length() == n){
			if(check(password)){
				System.out.println(password);
			}
			return;
		}
		
		if(i >= alpha.length) return;
		go(n, alpha, password+alpha[i], i+1);
		go(n, alpha, password, i+1);
	}
	
	// 모음이 하나 이상인지, 자음이 2개 이상인지 체크하는 메소드
	public static boolean check(String password){
		int ja = 0;
		int mo = 0;
		
		for(int x : password.toCharArray()){
			if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u'){
				mo += 1;;
			}else{
				ja += 1;
			}
		}
		return ja >= 2 && mo >= 1;
	}

}
