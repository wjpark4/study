package exercise;

import java.util.*;

class HashSetEx4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc");
		set.add(new Person21122("David", 10));
		set.add(new Person21122("David", 10));
		
		System.out.println(set);
	}
}

class Person21122{
	String name;
	int age;
	
	Person21122(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public boolean equals(Object obj){
		if(obj instanceof Person21122){
			Person21122 tmp = (Person21122)obj;
			return name.equals(tmp.name) && age==tmp.age;
		}
		return false;
	}
	
	public int hashCode(){
		return (name+age).hashCode();
	}
	
	public String toString(){
		return name + " : " + age;
	}
	
}