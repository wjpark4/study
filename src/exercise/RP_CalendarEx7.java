package exercise;

import java.util.*;

class RP_CalendarEx7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 2){
			System.out.println("Usage : java CalendarEx7 2004 11");
			return;
		}
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		
		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance();
		
		// ���� ��� 0���� 11������ ���� �����Ƿ� 1�� ����� �Ѵ�.
		// ���� ���, 2004�� 11�� 1���� sDay.set(2004, 10, 1);�� ���� ����� �Ѵ�.
		sDay.set(year, month-1, 1);					// �Է¿��� 1�Ϸ� �����Ѵ�.
		// �Է¿��� ���Ϸ� �����Ѵ�.
		eDay.set(year, month-1, sDay.getActualMaximum(Calendar.DATE));
		// 1���� ���� ���� �Ͽ��Ϸ� ��¥ ����
		sDay.add(Calendar.DATE, -sDay.get(Calendar.DAY_OF_WEEK) + 1);
		// ������ ���� ���� ����Ϸ� ��¥����
		eDay.add(Calendar.DATE, 7 - eDay.get(Calendar.DAY_OF_WEEK));
		
		System.out.println("    " + year + "�� " + month + "��");
		System.out.println(" SU MO TU WE TH FR SA");
		
		// �����ϰ� �������ϱ���(sDay <= eDay) 1�Ͼ� �������Ѱ��鼭 ��(Calendar.DATE)�� ����Ѵ�.
		for(int n=1; sDay.before(eDay) || sDay.equals(eDay); sDay.add(Calendar.DATE, 1)){
			int day = sDay.get(Calendar.DATE);
			System.out.print((day<10) ? "  " + day : " " + day);
			if(n++%7==0) System.out.println();
		}
		
	}
}
