package exercise;

import java.util.*;

class RP_StringTokenizerEx4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "삼십만삼천백십오";
		
		System.out.println(input);
		System.out.println(hangulToNum(input));
		
	}
	
	//한글을 숫자로 바꾸는 메서드
	public static long hangulToNum(String input){
		long result = 0;
		long tmpResult=0;
		long num = 0;
		
		final String NUMBER = "영일이삼사오육칠팔구";
		final String UNIT = "십백천만억조";
		final long[] UNIT_NUM = {10, 100, 1000, 10000, (long)Math.pow(10, 8), (long)Math.pow(10, 12)};
		
		StringTokenizer st = new StringTokenizer(input, UNIT, true);
		
		while(st.hasMoreTokens()){					// 입력받은 문자열에서  십백천만억조로 구분자로 나눠진 토큰이 있다면 토큰포함해서
			String token = st.nextToken();			// 현재가리키는 토큰
			// 숫자인지, 단위인지 확인한다.
			int check = NUMBER.indexOf(token);		// 현재토큰이 단위가 아니고 숫자인지 확인
			if(check == -1){						// 단위인 경우
				if("만억조".indexOf(token) == -1){	// 그단위가 십백천이면
					tmpResult += (num!=0 ? num : 1) * UNIT_NUM[UNIT.indexOf(token)];	// 임시저장소에 해당 단위를 곱해서 저장. 만약 num이 0이면 num을 1로 만든후 해당 단위 곱해서 저장
				}else{
					tmpResult += num;
					result += (tmpResult !=0 ? tmpResult : 1) * UNIT_NUM[UNIT.indexOf(token)];
					tmpResult = 0;
					//tmpResult += (num!=0 ? num : 1) * UNIT_NUM[UNIT.indexOf(token)];	// 임시저장소에 해당 단위를 곱해서 저장. 만약 num이 0이면 num을 1로 만든후 해당 단위 곱해서 저장
				}
				num = 0;
			}else{									// 숫자인 경우
				num = check;
			}
		}
		return result + tmpResult + num;
	}
}
