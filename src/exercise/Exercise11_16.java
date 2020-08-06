package exercise;

import java.text.*;

class Exercise11_16 {
	public static void main(String[] args){
		/*
		String data = "123,456,789.5";
		
		// 변환할 문자열의 형식을 지정
		DecimalFormat df = new DecimalFormat("#,###.##");
		DecimalFormat df2 = new DecimalFormat("#,####");
		
		try{
			Number num = df.parse(data);
			
			double d = num.doubleValue();
			System.out.println("data:"+data);
			System.out.println("반올림:" + Math.round(d));
			System.out.println("만단위:" + df2.format(d));
		}catch(Exception e){}
	}
	*/
		
		String data = "123,456,789.5";
		
		DecimalFormat df = new DecimalFormat("#,###.##");
		DecimalFormat df2 = new DecimalFormat("#,####");
		try{
			Number num = df.parse(data);
			
			double d = num.doubleValue();
			System.out.println("data : "+data);
			System.out.println("반올림 : "+Math.round(d));
			System.out.println("만단위 : " + df2.format(d));
			System.out.println("커스템 : " + df.format(d));
		}catch(Exception e){}
	}
}
