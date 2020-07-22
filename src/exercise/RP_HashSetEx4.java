package exercise;

import java.util.*;

class RP_HashSetEx4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set = new HashSet();
		
		set.add(new String("abc"));
		set.add(new String("abc"));
		set.add(new Person2RP_1123("David", 10));
		set.add(new Person2RP_1123("David", 10));
		
		System.out.println(set);
	}
}

class Person2RP_1123{
	String name;
	int age;
	
	Person2RP_1123(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public boolean equals(Object obj){
		if(obj instanceof Person2RP_1123){
			Person2RP_1123 tmp = (Person2RP_1123)obj;
			return name.equals(tmp.name) && age==tmp.age;
		}
		return false;
	}
	
	public int hashCode(){
		return (name+age).hashCode();
	}
	
	public String toString(){
		return name + " : " +age;
	}
}