package exercise;

import java.util.*;

class RP_ScannerEx1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);				// Scanner(InputStream source)
		String input = "";
		do{
			System.out.println("���ϴ� ���� �Է��ϼ���. �Է��� ��ġ���� Q�� �Է��ϼ���. ->");
			// �Է��� ���� ���� ������ �о� �´�.
			input = scan.nextLine();
			System.out.println("�Է��Ͻ� ���� " + input + "�Դϴ�.");
		}while(!input.equalsIgnoreCase("Q"));
		
		System.out.println("���α׷��� �����մϴ�.");
	}
}
