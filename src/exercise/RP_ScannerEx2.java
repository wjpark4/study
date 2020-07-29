package exercise;

import java.util.Scanner;
import java.io.File;

public class RP_ScannerEx2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new File("data2.txt"));
		int sum = 0;
		int cnt = 0;
		
		while(sc.hasNextInt()){
			sum += sc.nextInt();
			cnt++;
		}
		
		System.out.println("sum="+sum);
		System.out.println("average="+ (double)sum/cnt);
	}

}
