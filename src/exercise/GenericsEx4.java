package exercise;

import java.util.*;

class GenericsEx4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student1183> list = new ArrayList<Student1183>();
		list.add(new Student1183("자바왕",1,1,100,100,100));
		list.add(new Student1183("자바짱",1,2,90,80,70));
		list.add(new Student1183("홍길동",2,1,70,70,70));
		list.add(new Student1183("전우치",2,2,90,90,90));
		
		Collections.sort(list);
		
		Iterator<Student1183> it = list.iterator();
		
		while(it.hasNext()){
			Student1183 s = it.next();
			System.out.println(s);
		}
	}
}

// <T extends Comparable<? super T>>에서 T가 Student 타입임로
// <Student extends Comparable<Student>>와
// <Student extends Compatable<Person>>이 가능하다.
class Student1183 extends Person1183 implements Comparable<Person1183>{
	String name = "";
	int ban = 0;
	int no = 0;
	int koreanScore = 0;
	int mathScore = 0;
	int englsihScore = 0;
	
	int total = 0;
	
	Student1183(String name, int ban, int no, int koreanScore, int mathScore, int englishScore){
		super(ban + "-" + no, name);
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.koreanScore = koreanScore;
		this.mathScore = mathScore;
		this.englsihScore = englishScore;
		
		total = koreanScore + mathScore + englishScore;
	}
	
	public String toString(){
		return name + "\t"
				+ ban + "\t"
				+ no + "\t"
				+ koreanScore + "\t"
				+ mathScore + "\t"
				+ englsihScore + "\t"
				+ total + "\t";
	}
	
	// Comparable<Person>이므로 Person타입의 매개변수를 선언
	public int compareTo(Person1183 o){
		return id.compareTo(o.id);						// String클래스의 compareTo()를 호출
	}
	
} // student 클래스

class Person1183{
	String id;
	String name;
	
	Person1183(String id, String name){
		this.id = id;
		this.name = name;
	}
}