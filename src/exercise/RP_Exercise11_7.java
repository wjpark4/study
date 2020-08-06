package exercise;

import java.util.*;

class RP117_Student{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	RP117_Student(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal(){
		return kor+eng+math;
	}
	
	float getAverage(){
		return (int)((getTotal()/3f)*10+0.5)/10f;
	}
	
	public String toString(){
		return name
				+","+ban
				+","+no
				+","+kor
				+","+eng
				+","+math
				+","+getTotal()
				+","+getAverage()
				;
	}
}

class RP117_BanNoAscending implements Comparator{
	public int compare(Object o1, Object o2){
		if(o1 instanceof RP117_Student && o2 instanceof RP117_Student){
			RP117_Student s1 = (RP117_Student)o1;
			RP117_Student s2 = (RP117_Student)o2;
			
			int result = s1.ban - s2.ban;
			if(s1.ban==s2.ban){
				result = s1.no- s2.no;
			}
			return result;
		}
		return -1;
	}
}
class RP_Exercise11_7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(new RP117_Student("이자바",2,1,70,90,70));
		list.add(new RP117_Student("안자바",2,2,60,100,80));
		list.add(new RP117_Student("홍길동",1,3,100,100,100));
		list.add(new RP117_Student("남궁성",1,1,90,70,80));
		list.add(new RP117_Student("김자바",1,2,80,80,90));
		
		Collections.sort(list, new RP117_BanNoAscending());
		
		Iterator it = list.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());

	}
}
