package exercise;

import java.util.*;

class RP_GenericsEx4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<RP1183_Student> list = new ArrayList<RP1183_Student>();
		list.add(new RP1183_Student("자바왕",1,1,100,100,100));
		list.add(new RP1183_Student("자바짱",1,2,90,80,70));
		list.add(new RP1183_Student("홍길동",2,1,70,70,70));
		list.add(new RP1183_Student("전우치",2,2,90,90,90));
		
		Collections.sort(list);
		
		Iterator<RP1183_Student> it = list.iterator();
		
		while(it.hasNext()){
			RP1183_Student s = it.next();
			System.out.println(s);
		}

	}
}

// <T extends Comparable<? super T>>에서 T가 Student 타입이므로
// <Student extends Comparable<Student>>와
// <Student extends Comparable<Person>>이 가능하다.
class RP1183_Student extends RP1183_Person implements Comparable<RP1183_Person>{
	String name = "";
	int ban = 0;
	int no = 0;
	int koreanScore = 0;
	int mathScore = 0;
	int englishScore = 0;
	
	int total = 0;
	
	RP1183_Student(String name, int ban, int no, int koreanScore, int mathScore, int englishScore){
		super(ban+"-"+no, name);
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
	
	// Comparable<Person>이므로 Person타입의 매개변수를 선언
	public int compareTo(RP1183_Person o){
		return id.compareTo(o.id);							// String클래스의 compareTo()를 호출
	}
}

class RP1183_Person{
	String id;
	String name;
	
	RP1183_Person(String id, String name){
		this.id = id;
		this.name = name;
	}
}