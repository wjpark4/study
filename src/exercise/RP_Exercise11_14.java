package exercise;

import java.util.*;
import java.text.*;

class RP_Exercise11_14 {
	public static void main(String[] args) {
		/*
		Calendar cal = Calendar.getInstance();
		
		cal.set(2010, 0, 1);	// cal�� ��¥�� 2010�� 1�� 1�Ϸ� �����Ѵ�.
		
		for(int i=0; i<12; i++){
			int weekday = cal.get(Calendar.DAY_OF_WEEK);	// 1���� ������ ���Ѵ�.
			
			// �� ��° �Ͽ����� 1���� ���Ͽ� ���� �޶�����.
			// 1���� �Ͽ����� ��쿡�� �ι�° �Ͽ����� 8���̰�,
			// 1���� �ٸ� ������ ���� 16���� 1���� ����(weekday)�� ���� �� �� �ִ�.
			int secondSunday = (weekday==1) ? 8 : 16 - weekday;
			
			// �� ��° �Ͽ��Ϸ� cal�� ��¥(DAY_OF_MONTH)�� �ٲ۴�.
			cal.set(Calendar.DAY_OF_MONTH, secondSunday);
			
			Date d = cal.getTime();		// Calendar�� Date�� ��ȯ�Ѵ�.
			System.out.println(new SimpleDateFormat("yyyy-MM-dd�� F��° E�����Դϴ�.").format(d));
			
			// ��¥�� ������ 1�Ϸ� �����Ѵ�.
			cal.add(Calendar.MONTH, 1);
			cal.set(Calendar.DAY_OF_MONTH, 1);
		}
		*/
		Calendar cal = Calendar.getInstance();
		
		cal.set(2010, 0,1);
		
		for(int i=0; i<12; i++){
			int weekday = cal.get(Calendar.DAY_OF_WEEK);
			
			int secondSunday = (weekday==1) ? 8 : 16-weekday;
			
			cal.set(Calendar.DAY_OF_MONTH, secondSunday);
			
			Date d = cal.getTime();
			System.out.println(new SimpleDateFormat("yyyy-MM-dd�� F��° E�����Դϴ�.").format(d));
			
			cal.add(Calendar.MONTH, 1);
			cal.set(Calendar.DAY_OF_MONTH, 1);
		}
		
	}// main�޼���
}
