package exercise;

import java.util.*;

class RP_StringTokenizerEx4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "��ʸ���õ��ʿ�";
		
		System.out.println(input);
		System.out.println(hangulToNum(input));
		
	}
	
	//�ѱ��� ���ڷ� �ٲٴ� �޼���
	public static long hangulToNum(String input){
		long result = 0;
		long tmpResult=0;
		long num = 0;
		
		final String NUMBER = "�����̻�����ĥ�ȱ�";
		final String UNIT = "�ʹ�õ������";
		final long[] UNIT_NUM = {10, 100, 1000, 10000, (long)Math.pow(10, 8), (long)Math.pow(10, 12)};
		
		StringTokenizer st = new StringTokenizer(input, UNIT, true);
		
		while(st.hasMoreTokens()){					// �Է¹��� ���ڿ�����  �ʹ�õ�������� �����ڷ� ������ ��ū�� �ִٸ� ��ū�����ؼ�
			String token = st.nextToken();			// ���簡��Ű�� ��ū
			// ��������, �������� Ȯ���Ѵ�.
			int check = NUMBER.indexOf(token);		// ������ū�� ������ �ƴϰ� �������� Ȯ��
			if(check == -1){						// ������ ���
				if("������".indexOf(token) == -1){	// �״����� �ʹ�õ�̸�
					tmpResult += (num!=0 ? num : 1) * UNIT_NUM[UNIT.indexOf(token)];	// �ӽ�����ҿ� �ش� ������ ���ؼ� ����. ���� num�� 0�̸� num�� 1�� ������ �ش� ���� ���ؼ� ����
				}else{
					tmpResult += num;
					result += (tmpResult !=0 ? tmpResult : 1) * UNIT_NUM[UNIT.indexOf(token)];
					tmpResult = 0;
					//tmpResult += (num!=0 ? num : 1) * UNIT_NUM[UNIT.indexOf(token)];	// �ӽ�����ҿ� �ش� ������ ���ؼ� ����. ���� num�� 0�̸� num�� 1�� ������ �ش� ���� ���ؼ� ����
				}
				num = 0;
			}else{									// ������ ���
				num = check;
			}
		}
		return result + tmpResult + num;
	}
}
