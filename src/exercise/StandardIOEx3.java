package exercise;

import java.io.*;

class StandardIOEx3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream ps = null;
		FileOutputStream fos = null;
		
		try{
			fos = new FileOutputStream("test.txt");
			ps = new PrintStream(fos);
			System.setOut(ps);
		}catch(FileNotFoundException e){
			System.err.println("File not found");
		}
		
		System.out.println("Hello by System.out");
		System.err.println("Hello by System.err");
	}
}
