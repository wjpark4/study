package exercise;

public class Exercise4_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 12321;
		int tmp = number;
		
		int result = 0;
		
		while(tmp !=0){
				result = result*10 + tmp%10;
				tmp /=10;
			
		}
		
		if(number == result)
			System.out.println(number + "�� ȸ���� �Դϴ�.");
		else
			System.out.println(number + "�� ȸ������ �ƴմϴ�.");

	}

}
