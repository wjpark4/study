package exercise;

import java.util.*;

class RP118_Student implements Comparable{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	int total;
	int schoolRank;
	
	RP118_Student(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		total = kor+eng+math;
	}
	
	int getTotal(){
		return total;
	}
	
	float getAverage(){
		return (int)((getTotal()/3f)*10+0.5)/10f;
	}
	
	public int compareTo(Object o){
		if(o instanceof RP118_Student){
			RP118_Student s = (RP118_Student)o;
			return s.total - this.total;
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
				+","+schoolRank
				;
	}
}

class RP_Exercise11_8 {
	public static void calculateSchoolRank(List list){
		Collections.sort(list);
		
		int prevRank = -1;
		int prevTotal = -1;
		int length = list.size();
		
		for(int i=0; i<length; i++){
			RP118_Student s = (RP118_Student)list.get(i);
			
			if(s.total == prevTotal){
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
		list.add(new RP118_Student("ÀÌÀÚ¹Ù",2,1,70,90,70));
		list.add(new RP118_Student("¾ÈÀÚ¹Ù",2,2,60,100,80));
		list.add(new RP118_Student("È«±æµ¿",1,3,100,100,100));
		list.add(new RP118_Student("³²±Ã¼º",1,1,90,70,80));
		list.add(new RP118_Student("±èÀÚ¹Ù",1,2,80,80,90));
		
		calculateSchoolRank(list);
		
		Iterator it = list.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
		
	}
}
