package exercise;

//import java.awt.List;
import java.util.*;
class ArrayListEx2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int LIMIT = 10;					// �ڸ����� �ϴ� ������ ����
		String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
		int length = source.length();
		
		List list = new ArrayList(length/LIMIT + 10);	// �ڸ� ���ڸ� ���� ������ �����ְ� ��´�
		
		for(int i=0; i<length; i+=LIMIT){				// i�� source������ ������ �ȳѾ��
			if(i+LIMIT < length)						// LIMIT������ ������ source���� ������ �ȳѾ��
				list.add(source.substring(i, i+LIMIT));	// ���θ��� ����Ʈ�� i���� 10���� �߰��Ѵ�.
			else
				list.add(source.substring(i));			// �Ѿ�� i���� ������ �߰��Ѵ�.
		}
		
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
	}
}
