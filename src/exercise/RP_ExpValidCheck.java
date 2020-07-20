package exercise;

import java.util.*;

public class RP_ExpValidCheck {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 1){
			System.out.println("Usage : java ExpValidCheck \"EXPRESSION\"");
			System.out.println("Example : java ExpValidCheck \"((2+3)*1)+3\"");
			System.exit(0);
		}
		Stack st = new Stack();
		String expression = args[0];
		
		System.out.println("expression : " + expression);
		
		try{
			for(int i=0; i<expression.length(); i++){
				char ch = expression.charAt(i);
				
				if(ch=='('){
					st.push(ch+"");
				}else if(ch==')'){
					st.pop();
				}
			}
			
			if(st.isEmpty()){
				System.out.println("��ȣ�� ��ġ�մϴ�.");
			}else{
				System.out.println("��ȣ�� ��ġ���� �ʽ��ϴ�.");
			}
		} catch(EmptyStackException e){
			System.out.println("��ȣ�� ��ġ���� �ʽ��ϴ�.");
		}
	}
}
