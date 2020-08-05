package exercise;

import java.util.*;

class SutdaCard1111{
	int num;
	boolean isKwang;
	
	SutdaCard1111(){
		this(1, true);
	}
	
	SutdaCard1111(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public boolean equals(Object obj){
		if(obj instanceof SutdaCard1111){
			SutdaCard1111 c = (SutdaCard1111)obj;
			return num==c.num && isKwang==c.isKwang;
		}else{
			return false;
		}
	}
	
	public String toString(){
		return num + (isKwang ? "K" : "");
	}
	
	public int hashCode(){
		return toString().hashCode();
	}
}
class Exercise11_11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SutdaCard1111 c1 = new SutdaCard1111(3, true);
		SutdaCard1111 c2 = new SutdaCard1111(3, true);
		SutdaCard1111 c3 = new SutdaCard1111(1, true);
		
		HashSet set = new HashSet();
		set.add(c1);
		set.add(c2);
		set.add(c3);
		
		System.out.println(set);

	}
}
