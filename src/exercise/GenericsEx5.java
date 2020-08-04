package exercise;

import java.util.*;

class GenericsEx5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Student1184> map = new HashMap<String, Student1184>();
		map.put("1-1", new Student1184("�ڹٿ�",1,1,100,100,100));
		map.put("1-2", new Student1184("�ڹ�¯",1,2,90,80,70));
		map.put("2-1", new Student1184("ȫ�浿",2,1,70,70,70));
		map.put("2-2", new Student1184("����ġ",2,2,90,90,90));
		
		Student1184 s1 = map.get("1-1");
		System.out.println("1-1 :" + s1.name);
		
		Iterator<String> itKey = map.keySet().iterator();
		
		while(itKey.hasNext()){
			System.out.println(itKey.next());
		}
		
		Iterator<Student1184> itValue = map.values().iterator();
		int totalSum =  0;
		
		while(itValue.hasNext()){
			Student1184 s = itValue.next();
			totalSum += s.total;
		}
		
		System.out.println("��ü ���� : " + totalSum);

	}
}

class Student1184 extends Person1184 implements Comparable<Person1184>{
	String name = "";
	int ban = 0;
	int no = 0;
	int koreanScore = 0;
	int mathScore = 0;
	int englishScore = 0;
	
	int total = 0;
	
	Student1184(String name, int ban, int no, int koreanScore, int mathScore, int englsihScore){
		super(ban + "-" + no, name);
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.koreanScore = koreanScore;
		this.mathScore = mathScore;
		this.englishScore = englsihScore;
		
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
	
	//Comparable<Person>�̹Ƿ� PersonŸ���� �Ű������� ����
	public int compareTo(Person1184 o){
		return id.compareTo(o.id);			// StringŬ������ compareTo()�� ȣ��
	}
}

class Person1184{
	String id;
	String name;
	
	Person1184(String id, String name){
		this.id = id;
		this.name = name;
	}
}