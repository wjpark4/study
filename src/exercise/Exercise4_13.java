package exercise;

public class Exercise4_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value = "12o34";
		char ch = ' ';
		boolean isNumber = true;
		
		for(int i=0; i<value.length(); i++){
			ch = value.charAt(i);
			if(!(ch >= '0' && ch <= '9'))
				isNumber = false;
		}
		
		if(isNumber){
			System.out.println(value + "�� �����Դϴ�.");
		} else{
			System.out.println(value + "�� ���ڰ� �ƴմϴ�.");
		}

	}

}
