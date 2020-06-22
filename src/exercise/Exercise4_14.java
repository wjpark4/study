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
			System.out.print("1과 100사이의 값을 입력하세요 : ");
			input = s.nextInt();
			
			if(input > answer)
				System.out.println("더 작은 값을 입력해야 합니다. 시도 횟수 : " + count);
			else if(input == answer)
				System.out.println("정답입니다. 시도 횟수 : " + count);
			else
				System.out.println("더 큰 값을 입력해야 합니다. 시도 횟수 : " + count);
			
			
		} while(true);

	}

}
