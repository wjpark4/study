package exercise;

import java.util.*;

public class RP_CalendarEx5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar date = Calendar.getInstance();
		
		date.set(2005, 0, 3);
		System.out.println(toString(date));
		date.roll(Calendar.MONTH, 1);
		System.out.println(toString(date));
	}
	
	public static String toString(Calendar date){
		return date.get(Calendar.YEAR)+ "³â " + (date.get(Calendar.MONTH)+1)+ "¿ù " + date.get(Calendar.DATE) + "ÀÏ ";
	}
}
