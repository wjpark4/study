package exercise;

import java.util.*;

class RP_PropertiesEx1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		
		// prop에 키와 값을 저장한다.
		prop.setProperty("timeout", "30");
		prop.setProperty("language", "kr");
		prop.setProperty("size", "10");
		prop.setProperty("capacity", "10");
		
		// prop에 저장된 요소들을 Enumeration을 이용해서 출력한다.
		Enumeration e = prop.propertyNames();
		
		while(e.hasMoreElements()){
			String element = (String)e.nextElement();
			System.out.println(element + "=" + prop.getProperty(element));
		}
		
		System.out.println();
		prop.setProperty("size", "20");					// size의 값을 20으로 변경한다.
		System.out.println("size=" + prop.getProperty("size"));
		System.out.println("capacity=" + prop.getProperty("capacity", "20"));
		System.out.println("loadfactor=" + prop.getProperty("loadfactor", "0.75"));
		System.out.println(prop);
		prop.list(System.out);
	}
}
