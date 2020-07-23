package exercise;

import java.util.*;

class RP_CalendarEx2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ 1���� �����ϱ� ������, DAY_OF_WEEK[0]�� ����ξ���.
		final String[] DAY_OF_WEEK = {"", "��", "��", "ȭ", "��", "��", "��", "��"};
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		// month�� ��� 0���� �����ϱ� ������ 8���� ���, 7�� �����ؾ� �Ѵ�.
		// date1.set(2005, Calendar.AUGUST, 15);�� ���� �� ���� �ִ�.
		date1.set(2005, 7, 15);			// 2005�� 8�� 15��
		System.out.println("date1�� " + toString(date1) + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] + "�����̰�, ");
		System.out.println("����(date2)�� " + toString(date2) + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)] + "�����Դϴ�.");
		
		// �� ��¥���� ����
		long difference = (date2.getTimeInMillis() - date1.getTimeInMillis())/1000;
		System.out.println("�� ������ ���ݱ��� " + difference + "�ʰ� �������ϴ�.");
		System.out.println("�Ϸ� ����ϸ� " + difference/(24*60*60) + "���Դϴ�.");
	}
	
	public static String toString(Calendar date){
		return date.get(Calendar.YEAR)+"�� " + (date.get(Calendar.MONTH)+1)+ "�� " + date.get(Calendar.DATE) + "�� ";
	}
}
