package exercise;

import java.util.*;

public class Baek_14501 {
	static int ans = 0;
	static void max_Pay(int[] t, int[] p, int index, int sum){
		if(index == t.length){
			if(sum > ans) ans = sum;
			return;
		}
		if(index > t.length){
			return;
		}
		
		max_Pay(t, p, index+t[index], sum+p[index]);
		max_Pay(t, p, index+1, sum);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] t = new int[n];
		int[] p = new int[n];
		
		for(int i=0; i<n; i++){
			t[i] = sc.nextInt();
			p[i] = sc.nextInt();
		}
		max_Pay(t, p, 0, 0);
		System.out.println(ans);
	}
}
