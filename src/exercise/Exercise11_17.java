package exercise;

import java.util.*;
import java.text.*;

class Exercise11_17 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String pattern = "yyyy/MM/dd";
		String pattern2 = "�Է��Ͻ� ��¥�� E�����Դϴ�.";  // E�� ��~�� ���� �ϳ��� �ȴ�.
		
		DateFormat df = new SimpleDateFormat(pattern);
		DateFormat df2 = new SimpleDateFormat(pattern2);
		
		Scanner s = new Scanner(System.in);
		
		Date inDate = null;
		
		do{
			System.out.println("��¥�� " + pattern + "�� ���·� �Է����ּ���. �Է¿� : 2007/05/11");
			
			try{
				System.out.print(">>");
				inDate = df.parse(s.nextLine()); // �Է¹��� ��¥�� Date�� ��ȯ�Ѵ�.
				break;  // parse()���� ���ܰ� �߻��ϸ� �� ������ ������� �ʴ´�.
			}catch(Exception e){}
			
		}while(true);
		System.out.println(df2.format(inDate));
		
	}
}
