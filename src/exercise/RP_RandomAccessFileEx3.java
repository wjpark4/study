package exercise;

import java.io.*;

class RP_RandomAccessFileEx3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		try{
			RandomAccessFile raf = new RandomAccessFile("score2.dat", "r");
			int i=4;
			
			while(true){
				raf.seek(i);
				sum += raf.readInt();
				i += 16;
			}
		}catch(EOFException e){
			System.out.println("sum : " + sum);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
