package exercise;

import java.util.Scanner;

public class Baek_10971 {
	public static boolean next_permutation(int[] a){
		int i = a.length-1;
		while(i>0 && a[i-1]>=a[i]){
			i -= 1;
		}
		
		if(i <= 0){
			return false;
		}
		
		int j = a.length - 1;
		while(a[j] <= a[i-1]){
			j -= 1;
		}
		
		int temp = a[i-1];
		a[i-1] = a[j];
		a[j] = temp;
		
		j = a.length-1;
		while(i<j){
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i += 1;
			j -= 1;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = new int[n][n];				// 모든 경로의 경로값 입력을 위해 2중 배열
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				a[i][j] = sc.nextInt();
			}
		}
		int[] d = new int[n];					// 순열식으로 차례대로 permutation 적용하기 위한 distance배열
		for(int i=0; i<n; i++){
			d[i] = i;
		}
		int ans = Integer.MAX_VALUE;
		
		do{
			if(d[0] != 0) break;
			boolean ok = true;
			int sum = 0;
			for(int i=0; i<n-1; i++){
				if(a[d[i]][d[i+1]] == 0){		// 다음 경로가 막혀있지 않다면
					ok = false;					// 가는 경로 막힘
				}else{
					sum += a[d[i]][d[i+1]];		// 막히지 않았으면 경로값 추가
				}
			}
			if(ok && a[d[n-1]][d[0]] != 0){		// 지금까지 그리고 마지막 되돌아 가는 경로 막히지 않았으면 
				sum += a[d[n-1]][d[0]];			// 경로값 추가
				if(ans > sum){					// sum이 최소값이면 ans에 sum추가
					ans = sum;
				}
			}
		}while(next_permutation(d));
		System.out.println(ans);
	}
}
