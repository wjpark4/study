package exercise;

import java.util.*;
import java.text.*;

class RP_DateFormatEx3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat df = new SimpleDateFormat("yyyy�� MM�� dd��");
		SimpleDateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
		
		try{
			Date d = df.parse("2001�� 3�� 10��");
			System.out.println(df2.format(d));
		}catch(Exception e){}
	}
}
