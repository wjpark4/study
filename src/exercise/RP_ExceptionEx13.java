package exercise;

import java.io.*;
import java.util.*;

class RP_ExceptionEx13 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream ps = null;
		FileOutputStream fos = null;
		
		try{
			fos = new FileOutputStream("error.log", true);	// error.log파일에 출력 준비
			ps = new PrintStream(fos);						// 경로지정
			System.setErr(ps);								// err의 출력을 화면이 아닌, error.log 파일로 변경
			
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		}catch(Exception ae){
			System.err.println("---------------------------------");
			System.err.println("예외발생시간 : " + new Date());
			ae.printStackTrace(System.err);
			System.err.println("예외메시지 : " + ae.getMessage());
			System.err.println("---------------------------------");
			//ae.printStackTrace(ps);
			//ps.println("예외메시지 : " + ae.getMessage());
		}
		System.out.println(6);
	}
}
