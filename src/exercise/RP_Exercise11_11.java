package exercise;

import java.util.*;

class RP1111_SutdaCard{
	int num;
	boolean isKwang;
	
	RP1111_SutdaCard(){
		this(1, true);
	}
	
	RP1111_SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public boolean equals(Object obj){
		if(obj instanceof RP1111_SutdaCard){
			RP1111_SutdaCard c = (RP1111_SutdaCard)obj;
			return num == c.num && isKwang==c.isKwang;
		}else{
			return false;
		}
	}
	
	public String toString(){
		return num + (isKwang ? "K":"");
	}
	
	public int hashCode(){
		return toString().hashCode();
	}
}

class RP_Exercise11_11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RP1111_SutdaCard c1 = new RP1111_SutdaCard(3, true);
		RP1111_SutdaCard c2 = new RP1111_SutdaCard(3, true);
		RP1111_SutdaCard c3 = new RP1111_SutdaCard(1, true);
		
		HashSet set = new HashSet();
		set.add(c1);
		set.add(c2);
		set.add(c3);
		
		System.out.println(set);

	}
}
