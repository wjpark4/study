package exercise;

import java.util.*;

class GenericsEx2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student1181> list = new ArrayList<Student1181>();
		list.add(new Student1181("ÀÚ¹Ù¿Õ",1,1));
		list.add(new Student1181("ÀÚ¹ÙÂ¯",1,2));
		list.add(new Student1181("È«±æµ¿",2,1));
		list.add(new Student1181("Àü¿ìÄ¡",2,2));
		
		Iterator<Student1181> it = list.iterator();
		
		while(it.hasNext()){
			Student1181 s = it.next();
			System.out.println(s.name);
		}
	}
}

class Student1181{
	String name = "";
	int ban;
	int no;
	
	Student1181(String name, int ban, int no){
		this.name = name;
		this.ban = ban;
		this.no = no;
	}
}