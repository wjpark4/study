package exercise;

import java.util.*;
import java.text.*;

public class DateFormatEx3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateFormat df = new SimpleDateFormat("yyyy�� MM�� dd��");
		DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
		
		try{
			Date d = df.parse("2001�� 3�� 10��");
			//System.out.println(d);
			System.out.println(df2.format(d));
			
		}catch(Exception e) {}
	}
}
