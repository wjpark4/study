package exercise;

class RP_CalendarEx8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String date1 = "200508";
		String date2 = "200405";
		
		// ��� ���� subString���� �߶� ������ ��ȯ�Ѵ�.
		// �⿡ 12�� ���ؼ� ���� ��ȯ�� ������ ������ �ϸ� �������� ���� �� �ִ�.
		int month1 = Integer.parseInt(date1.substring(0, 4))*12 + Integer.parseInt(date1.substring(4));
		int month2 = Integer.parseInt(date2.substring(0, 4))*12 + Integer.parseInt(date2.substring(4));
		
		System.out.println(date1 + "�� " + date2 + "�� ���̴� " + Math.abs(month1-month2) + "���� �Դϴ�.");
	}
}
