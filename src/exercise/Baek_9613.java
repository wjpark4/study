package exercise;

import java.util.Scanner;

public class Baek_9613 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int test_case = sc.nextInt();
		int i = 0;
		while(i < test_case){
			int pair_num = sc.nextInt();
			int[] num = new int[pair_num];
			for(int j=0; j<pair_num; j++){
				num[j] = sc.nextInt();
			}
			
			long total_gpair = 0;
			
			for(int k=0; k<pair_num-1; k++){
				for(int l=k+1; l<pair_num; l++){
					total_gpair += gcd(num[k], num[l]);
				}
			}
			System.out.println(total_gpair);
			i++;
			
		}

	}
	
	static int gcd(int a, int b){
		if(b == 0)
			return a;
		int r = a % b;
		return gcd(b, r);
	}
}
