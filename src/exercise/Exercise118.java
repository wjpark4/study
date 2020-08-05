package exercise;

import java.util.*;

class Student118 implements Comparable{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	int total;
	int schoolRank;
	
	Student118(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
	}
	
	int getTotal(){
		return total;
	}
	
	float getAverage(){
		return (int)((getTotal()/3f)*10+0.5)/10f;
	}
	
	public int compareTo(Object o){
		if(o instanceof Student118){
			Student118 tmp = (Student118)o;
			return tmp.total-this.total;
		}
		return -1;
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
				+","+schoolRank;
	}
}


class Exercise118 {
	
	public static void calculateSchoolRank(List list){
		Collections.sort(list);
		
		int prevRank = -1;
		int prevTotal = -1;
		int length = list.size();
		
		for(int i=0; i<length; i++){
			Student118 s = (Student118)list.get(i);
			
			if(s.total==prevTotal){
				s.schoolRank = prevRank;
			}else{
				s.schoolRank = i+1;
			}
			prevRank = s.schoolRank;
			prevTotal = s.total;
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(new Student118("ÀÌÀÚ¹Ù",2,1,70,90,70));
		list.add(new Student118("¾ÈÀÚ¹Ù",2,2,60,100,80));
		list.add(new Student118("È«±æµ¿",1,3,100,100,100));
		list.add(new Student118("³²±Ã¼º",1,1,90,70,80));
		list.add(new Student118("±èÀÚ¹Ù",1,2,80,80,90));
		
		calculateSchoolRank(list);
		
		Iterator it = list.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
		
	}
}
