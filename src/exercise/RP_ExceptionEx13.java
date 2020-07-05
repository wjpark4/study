package exercise;

import java.io.*;
import java.util.*;

class RP_ExceptionEx13 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream ps = null;
		FileOutputStream fos = null;
		
		try{
			fos = new FileOutputStream("error.log", true);	// error.log���Ͽ� ��� �غ�
			ps = new PrintStream(fos);						// �������
			System.setErr(ps);								// err�� ����� ȭ���� �ƴ�, error.log ���Ϸ� ����
			
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		}catch(Exception ae){
			System.err.println("---------------------------------");
			System.err.println("���ܹ߻��ð� : " + new Date());
			ae.printStackTrace(System.err);
			System.err.println("���ܸ޽��� : " + ae.getMessage());
			System.err.println("---------------------------------");
			//ae.printStackTrace(ps);
			//ps.println("���ܸ޽��� : " + ae.getMessage());
		}
		System.out.println(6);
	}
}
