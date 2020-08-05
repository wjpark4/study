package exercise;

import java.util.*;

class RP_GenericsEx4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<RP1183_Student> list = new ArrayList<RP1183_Student>();
		list.add(new RP1183_Student("�ڹٿ�",1,1,100,100,100));
		list.add(new RP1183_Student("�ڹ�¯",1,2,90,80,70));
		list.add(new RP1183_Student("ȫ�浿",2,1,70,70,70));
		list.add(new RP1183_Student("����ġ",2,2,90,90,90));
		
		Collections.sort(list);
		
		Iterator<RP1183_Student> it = list.iterator();
		
		while(it.hasNext()){
			RP1183_Student s = it.next();
			System.out.println(s);
		}

	}
}

// <T extends Comparable<? super T>>���� T�� Student Ÿ���̹Ƿ�
// <Student extends Comparable<Student>>��
// <Student extends Comparable<Person>>�� �����ϴ�.
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
	
	// Comparable<Person>�̹Ƿ� PersonŸ���� �Ű������� ����
	public int compareTo(RP1183_Person o){
		return id.compareTo(o.id);							// StringŬ������ compareTo()�� ȣ��
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