package exercise;

import java.util.*;

class RP_GenericsEx2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<RP1181_Student> list = new ArrayList<RP1181_Student>();
		list.add(new RP1181_Student("ÀÚ¹Ù¿Õ",1,1));
		list.add(new RP1181_Student("ÀÚ¹ÙÂ¯",1,2));
		list.add(new RP1181_Student("È«±æµ¿",2,1));
		list.add(new RP1181_Student("Àü¿ìÄ¡",2,2));
		
		Iterator<RP1181_Student> it = list.iterator();
		
		while(it.hasNext()){
			RP1181_Student s = it.next();
			System.out.println(s.name);
		}
	}
}

class RP1181_Student{
	String name = "";
	int ban;
	int no;
	
	RP1181_Student(String name, int ban, int no){
		this.name = name;
		this.ban = ban;
		this.no = no;
	}
}