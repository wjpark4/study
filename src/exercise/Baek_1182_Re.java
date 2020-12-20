package exercise;

import java.util.*;

public class Baek_1182_Re {
	static int go(int[] a, int m, int index, int sum){
		if(index == a.length){
			if(sum == m){
				return 1;
			}else{
				return 0;
			}
		}
		return go(a, m, index+1, sum+a[index]) + go(a, m, index+1, sum);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();			// 수열의 크기
		int m = sc.nextInt();			// 부분집합의 합
		
		int[] a = new int[n];
		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
		}
		
		int ans = 0;					// 부분 수열의 개수
		ans = go(a, m, 0, 0);
		if(m == 0) ans -= 1;
		
		System.out.println(ans);
	}
}
