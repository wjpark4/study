package exercise;

import java.util.*;

class Student115 implements Comparable{
	String name;
	int ban;
	int no;
	int kor, eng, math;
	
	Student115(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal(){
		return kor + eng + math;
	}
	
	float getAverage(){
		return (int)((getTotal()/3f)*10+0.5)/10f;
	}
	
	public String toString(){
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage();
	}
	
	public int compareTo(Object o){
		//int result = -1;
		
		if(o instanceof Student115){
			Student115 tmp = (Student115)o;
			return name.compareTo(tmp.name);
		}else{
			return -1;
		}
	}
}

class Exercise11_5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(new Student115("홍길동",1,1,100,100,100));
		list.add(new Student115("남궁성",1,2,90,70,80));
		list.add(new Student115("김자바",1,3,80,80,90));
		list.add(new Student115("이자바",1,4,70,90,70));
		list.add(new Student115("안자바",1,5,60,100,80));
		
		Collections.sort(list);
		Iterator it = list.iterator();
		while(it.hasNext())
			System.out.println(it.next());

	}
}
