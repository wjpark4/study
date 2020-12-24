package exercise;

import java.util.*;

public class Baek_15649 {
	static boolean[] check = new boolean[10];
	static int[] a = new int[10];
	
	static void go(int index, int n, int m){
		if(index == m){
			for(int i=0; i<m; i++){
				System.out.print(a[i]);
				if(i != m-1) System.out.print(' ');
			}
		}
		for(int i=1; i<=n; i++){
			if(check[i] == true) continue;
			check[i] = true;
			a[index] = i;
			go(index+1, n, m);
			check[i] = false;
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		go(0, n, m);
	}

}
