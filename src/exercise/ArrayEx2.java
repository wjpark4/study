package exercise;

public class ArrayEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = { 79, 88, 91, 33, 100, 55, 95 };
		
		int max = score[0];
		int min = score[0];
		
		for(int i=1; i<score.length; i++){
			if(score[i] > max){
				max = score[i];
			}
			if(score[i] < min){
				min = score[i];
			}
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
	}

}
