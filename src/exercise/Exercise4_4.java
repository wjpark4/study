package exercise;

public class Exercise4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int sum = 0;
		while(sum <100){
			if(i%2 ==0)
				sum +=-i;
			else
				sum +=i;
			i++;
		}
		System.out.println("�� �̻��� �Ǿ�� 100�̻��� �Ǵ°�? " + (i-1));

	}

}
