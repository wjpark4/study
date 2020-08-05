package exercise;

import java.util.*;

class RP_GenericsEx3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<RP1182_Student> list = new ArrayList<RP1182_Student>();
		list.add(new RP1182_Student("ÀÚ¹Ù¿Õ",1,1,100,100,100));
		list.add(new RP1182_Student("ÀÚ¹ÙÂ¯",1,2,90,80,70));
		list.add(new RP1182_Student("È«±æµ¿",2,1,70,70,70));
		list.add(new RP1182_Student("Àü¿ìÄ¡",2,2,90,90,90));
		
		Collections.sort(list);
		
		Iterator<RP1182_Student> it = list.iterator();
		
		while(it.hasNext()){
			RP1182_Student s = it.next();
			System.out.println(s);
		}
	}
}

class RP1182_Student implements Comparable<RP1182_Student>{
	String name = "";
	int ban = 0;
	int no = 0;
	int koreanScore = 0;
	int mathScore = 0;
	int englishScore = 0;
	
	int total = 0;
	
	RP1182_Student(String name, int ban, int no, int koreanScore, int mathScore, int englishScore){
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
	
	public int compareTo(RP1182_Student o){
		return o.total - this.total;
	}
}