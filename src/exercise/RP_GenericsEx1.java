package exercise;

import java.util.*;

class RP1180_Product{}
class RP1180_Tv extends RP1180_Product{}
class RP1180_Audio extends RP1180_Product{}

class RP_GenericsEx1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<RP1180_Product> productList = new ArrayList<RP1180_Product>();
		ArrayList<RP1180_Tv> tvList = new ArrayList<RP1180_Tv>();
		
		productList.add(new RP1180_Tv());
		productList.add(new RP1180_Audio());
		
		tvList.add(new RP1180_Tv());
		tvList.add(new RP1180_Tv());
		
		printAll(productList);
		// printAll(tvList);
		
		printAll2(productList);
		printAll2(tvList);
	}
	
	public static void printAll(ArrayList<RP1180_Product> list){
		for(RP1180_Product p : list){
			System.out.println(p);
		}
	}
	
	// public static void printAll2(ArrayList<? extends RP1180_Product> lst){
	public static <T extends RP1180_Product> void printAll2(ArrayList<T> list){
		for(RP1180_Product p : list){
			System.out.println(p);
		}
	}
}
