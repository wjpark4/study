package exercise;

import java.util.Scanner;

public class Baek_10974 {
	
	public static boolean next_permutation(int[] a){
		int i = a.length-1;
		while(i > 0 && a[i] < a[i-1]){
			i -= 1;
		}
		if(i<=0) return false;
		
		int j = a.length-1;
		
		while(a[j] <= a[i-1]){
			j -= 1;
		}
		
		int temp = a[i-1];
		a[i-1] = a[j];
		a[j] = temp;
		
		j = a.length -1;
		
		while(i<j){
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i += 1;
			j -= 1;
		}
		return true;
	}
	/*
	public static boolean permutation(int[] a){
		int i = a.length-1;
		
		while(i>0 && a[i] <= a[i-1]){
			i -= 1;
		}
		
		if(i <= 0) return false;
		
		int j = a.length-1;
		
		if(a[i-1] >= a[j]){
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
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n];
		for(int i=0; i<n; i++){
			num[i] = i+1;
		}
		
		do{
			for(int i=0; i<n; i++){
				System.out.print(num[i] + " ");
			}
			System.out.println();
		}while(next_permutation(num));
	}
}
