package exercise;

import java.util.Scanner;
import java.io.File;
//import java.nio.file.*;
import java.io.*;


public class ScannerEx2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new File("C:\\data2.txt"));
		int sum = 0;
		int cnt = 0;
		
		while(sc.hasNext()){
			sum += sc.nextInt();
			cnt++;
		}
		
		System.out.println("sum="+sum);
		System.out.println("average="+ (double)sum/cnt);

	}

}
