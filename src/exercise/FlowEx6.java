package exercise;

public class FlowEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = (int) (Math.random() * 10) + 1;
		
		switch(score*100){
			case 100:
				System.out.println("����� ������ 100�̰�, ��ǰ�� �������Դϴ�.");
				break;
			case 200:
				System.out.println("����� ������ 200�̰�, ��ǰ�� TV�Դϴ�.");
				break;
			case 300:
				System.out.println("����� ������ 300�̰�, ��ǰ�� ��Ʈ���Դϴ�.");
				break;
			case 400:
				System.out.println("����� ������ 400�̰�, ��ǰ�� �ڵ����Դϴ�.");
				break;
			default:
				System.out.println("�˼������� ��ô��� ������ �ش� ��ǰ�� �����ϴ�.");
			
			
		}

	}

}
