package exercise;

public class FlowEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 1;
		
		switch(score*100) {
			case 100:
				System.out.println("����� ������ 100�̰�, ��ǰ�� �������Դϴ�.");
			case 200:
				System.out.println("����� ������ 200�̰�, ��ǰ�� TV�Դϴ�.");
			case 300:
				System.out.println("����� ������ 300�̰�, ��ǰ�� ��Ʈ���Դϴ�.");
			case 400:
				System.out.println("����� ������ 400�̰�, ��ǰ�� �ڵ����Դϴ�.");
			default:
				System.out.println("�˼������� ����� ������ �ش� ��ǰ�� �����ϴ�.");
		}

	}

}
