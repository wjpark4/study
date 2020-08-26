package exercise;

import java.io.*;

class RP_DataOutputStreamEx1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		try{
			fos = new FileOutputStream("sample.dat");
			dos = new DataOutputStream(fos);
			dos.writeInt(10);
			dos.writeFloat(20.0f);
			dos.writeBoolean(true);
			
			dos.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
