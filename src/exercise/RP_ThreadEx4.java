package exercise;

public class RP_ThreadEx4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		for(int i=0; i<300; i++){
			System.out.print("-");
		}
		System.out.print("�ҿ�ð�1 :" + (System.currentTimeMillis()-startTime));
		
		for(int i=0; i<300; i++){
			System.out.print("|");
		}
		System.out.print("�ҿ�ð�2 : "+ (System.currentTimeMillis()-startTime));
	}
}
