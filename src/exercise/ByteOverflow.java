package exercise;

public class ByteOverflow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 0;
		int i = 0;
		
		// �ݺ����� �̿��ؼ� b�� ���� 1��, 0���� 270���� ������Ų��.
		for(int x=0; x <= 270; x++){
			System.out.print(b++);
			System.out.print('\t');
			System.out.println(i++);
		}

	}

}
