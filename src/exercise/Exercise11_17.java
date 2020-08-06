package exercise;

import java.util.*;
import java.text.*;

class Exercise11_17 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String pattern = "yyyy/MM/dd";
		String pattern2 = "입력하신 날짜는 E요일입니다.";  // E는 월~토 중의 하나가 된다.
		
		DateFormat df = new SimpleDateFormat(pattern);
		DateFormat df2 = new SimpleDateFormat(pattern2);
		
		Scanner s = new Scanner(System.in);
		
		Date inDate = null;
		
		do{
			System.out.println("날짜를 " + pattern + "의 형태로 입력해주세요. 입력예 : 2007/05/11");
			
			try{
				System.out.print(">>");
				inDate = df.parse(s.nextLine()); // 입력받은 날짜를 Date로 변환한다.
				break;  // parse()에서 예외가 발생하면 이 문장은 수행되지 않는다.
			}catch(Exception e){}
			
		}while(true);
		System.out.println(df2.format(inDate));
		
	}
}
