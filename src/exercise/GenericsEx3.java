package exercise;

import java.util.*;

class GenericsEx3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student1182> list = new ArrayList<Student1182>();
		list.add(new Student1182("ÀÚ¹Ù¿Õ",1,1,100,100,100));
		list.add(new Student1182("ÀÚ¹ÙÂ¯",1,2,90,80,70));
		list.add(new Student1182("È«±æµ¿",2,1,70,70,70));
		list.add(new Student1182("Àü¿ìÄ¡",2,2,90,90,90));
		
		Collections.sort(list);
		
		Iterator<Student1182> it = list.iterator();
		
		while(it.hasNext()){
			Student1182 s = it.next();
			System.out.println(s);
		}
	}
}

class Student1182 implements Comparable<Student1182>{
	String name = "";
	int ban = 0;
	int no = 0;
	int koreanScore = 0;
	int mathScore = 0;
	int englishScore = 0;
	
	int total = 0;
	
	Student1182(String name, int ban, int no, int koreanScore, int mathScore, int englishScore){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.koreanScore = koreanScore;
		this.mathScore = mathScore;
		this.englishScore = englishScore;
		
		total = koreanScore + mathScore + englishScore;
	}
	
	public String toString(){
		return name + "\t"
				+ ban + "\t"
				+ no + "\t"
				+ koreanScore + "\t"
				+ mathScore + "\t"
				+ englishScore + "\t"
				+ total + "\t";
	}
	
	public int compareTo(Student1182 o){
		return o.total - this.total;
	}
}
