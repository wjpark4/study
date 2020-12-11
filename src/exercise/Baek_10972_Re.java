package exercise;

import java.util.Scanner;

public class Baek_10972_Re {
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
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] input = new int[n];
		
		for(int i=0; i<n; i++){
			input[i] = sc.nextInt();
		}
		
		if(next_permutation(input)){
			for(int i=0; i<n; i++){
				System.out.print(input[i] + " ");
			}
		} else{
			System.out.println("-1");
		}

	}
}
