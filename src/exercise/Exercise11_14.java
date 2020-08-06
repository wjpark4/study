package exercise;

import java.util.*;
import java.text.*;

class Exercise11_14 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar cal = Calendar.getInstance();
		
		cal.set(2010, 0, 1);
		
		for(int i=0; i<12; i++){
			int weekday = cal.get(Calendar.DAY_OF_WEEK);
			
			// 2��° �Ͽ����� 1���� ���Ͽ� ���� �޶�����.
			// 1���� �Ͽ����� ��쿡�� 2��° �Ͽ����� 8���̰�,
			// 1���� �ٸ� ������ ���� 16���� 1���� ������ ���� �� �� �ִ�.
			int secondSunday = (weekday==1) ? 8 : 16 - weekday;
			
			// �ι�° �Ͽ��Ϸ� cal�� ��¥�� �ٲ۴�.
			cal.set(Calendar.DAY_OF_MONTH, secondSunday);
			
			Date d = cal.getTime();
			System.out.println(new SimpleDateFormat("yyyy-MM-dd�� F��° E�����Դϴ�.").format(d));
			
			// ��¥�� ������ 1�Ϸ� �����Ѵ�.
			cal.add(Calendar.MONTH, 1);
			cal.set(Calendar.DAY_OF_MONTH, 1);
		}
		
	}
}
