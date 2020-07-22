package exercise;

import java.util.*;

class RP_HashSetEx3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc");
		set.add(new PersonRP_1122("David", 10));
		set.add(new PersonRP_1122("David", 10));
		
		System.out.println(set);
		
	}
}

class PersonRP_1122{
	String name;
	int age;
	
	PersonRP_1122(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString(){
		return name + ":" + age;
	}
}