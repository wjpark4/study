package exercise;

public class Exercise4_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum =0;
		int count=0;
		for(int i=1; i<=6; i++){
			for(int j=1; j<=6; j++){
				sum =0;
				sum = i+j;
				if(sum == 6)
					count++;
			}
		}
		System.out.println("눈의 합이 6인 경우의 수 : " + count);

	}

}
