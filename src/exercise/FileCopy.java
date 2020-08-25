package exercise;

import java.io.*;

class FileCopy {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			FileInputStream fis = new FileInputStream(args[0]);
			FileOutputStream fos = new FileOutputStream(args[1]);
			
			int data = 0;
			while((data = fis.read()) != -1){
				fos.write(data);				// void write(int b)
			}
			
			fis.close();
			fis.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
