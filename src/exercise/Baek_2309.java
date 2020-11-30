package exercise;

import java.util.*;

public class Baek_2309 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] nan = new int[9];
		int sum = 0;
		
		for(int i=0; i<9; i++){
			nan[i] = sc.nextInt();
			sum += nan[i];
		}
		
		Arrays.sort(nan);
		
		for(int i=0; i<9-1; i++){
			for(int j=i+1; j<9; j++){
				if(sum - nan[i] - nan[j] == 100){
					for(int k=0; k<9; k++){
						if(k==i || k==j) continue;
						System.out.println(nan[k]);
					}
					System.exit(0);
				}
			}
		}
	}
}
