package exercise;

public class Exercise4_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = (int)(Math.random()*100) + 1;
		int input = 0;
		int count =0;
		
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		do {
			count++;
			System.out.print("1�� 100������ ���� �Է��ϼ��� : ");
			input = s.nextInt();
			
			if(input > answer)
				System.out.println("�� ���� ���� �Է��ؾ� �մϴ�. �õ� Ƚ�� : " + count);
			else if(input == answer)
				System.out.println("�����Դϴ�. �õ� Ƚ�� : " + count);
			else
				System.out.println("�� ū ���� �Է��ؾ� �մϴ�. �õ� Ƚ�� : " + count);
			
			
		} while(true);

	}

}
