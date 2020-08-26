package exercise;

import java.io.*;

class RP_DataInputStreamEx2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int score = 0;
		
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try{
			fis = new FileInputStream("score.dat");
			dis = new DataInputStream(fis);
			
			while(true){
				score = dis.readInt();
				System.out.println(score);
				sum += score;
			}
		}catch(EOFException e){
			System.out.println("������ ������ " + sum + "�Դϴ�.");
		}catch(IOException ie){
			ie.printStackTrace();
		}finally{
			try{
				if(dis != null)
					dis.close();
			}catch(IOException ie){
				ie.printStackTrace();
			}
			
		}
	}
}
