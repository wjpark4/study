package exercise;

import java.util.*;

class Product1180{}
class Tv1180 extends Product1180{}
class Audio1180 extends Product1180{}

class GenericsEx1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Product1180> productList = new ArrayList<Product1180>();
		ArrayList<Tv1180> tvList = new ArrayList<Tv1180>();
		
		productList.add(new Tv1180());
		productList.add(new Audio1180());
		
		tvList.add(new Tv1180());
		tvList.add(new Tv1180());
		
		printAll(productList);
		// printAll(tvList);
		
		printAll2(productList);
		printAll2(tvList);
	}
	
	public static void printAll(ArrayList<Product1180> list){
		for(Product1180 p : list){
			System.out.println(p);
		}
	}
	
	//public static void printAll2(ArrayList<? extends Product> list){
	public static <T extends Product1180> void printAll2(ArrayList<T> list){
		for(Product1180 p : list){
			System.out.println(p);
		}
	}
	
	
}
