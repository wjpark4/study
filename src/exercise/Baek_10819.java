package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Baek_10819 {
	public static boolean next_permutation(int[] a){
		int i = a.length-1;
		while(i > 0 && a[i-1] > a[i]){
			i -= 1;
		}
		if(i<=0){
			return false;
		}
		
		int j = a.length-1;
		while(a[i-1] > a[j]){
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
	
	static int calculate(int[] a){
		int sum = 0;
		for(int i=0; i<a.length-1; i++){
			sum += Math.abs(a[i]-a[i+1]);
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int max = 0;
		for(int i=0; i<N; i++){
			A[i] = sc.nextInt();
		}
		Arrays.sort(A);
		do{
			if(calculate(A) > max){
				max = calculate(A);
			}
		}while(next_permutation(A));
		
		System.out.println(max);
		
	}

}
