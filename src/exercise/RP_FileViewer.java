package exercise;

import java.io.*;

class RP_FileViewer {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream(args[0]);
		int data = 0;
		while((data=fis.read()) != -1){
			char c = (char)data;
			System.out.print(c);
		}
	}
}
