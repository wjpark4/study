package exercise;

import java.util.*;

class Student119 implements Comparable{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	int total;
	int schoolRank;
	int classRank;
	
	Student119(String name, int ban, int no, int kor, int eng, int math){
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
		if(o instanceof Student119){
			Student119 tmp = (Student119)o;
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
				+","+schoolRank
				+","+classRank;
	}
}

class ClassTotalComparator119 implements Comparator{
	public int compare(Object o1, Object o2){
		if(o1 instanceof Student119 && o2 instanceof Student119){
			Student119 s1 = (Student119)o1;
			Student119 s2 = (Student119)o2;
			
			int result = s1.ban - s2.ban;
			if(result==0){
				result = s1.classRank-s2.classRank;
			}
			return result;
		}
		return -1;
	}
}

class Exercise11_9 {
	public static void calculateClassRank(List list){
		// 먼저 반별 총점기준 내림차순으로 정렬한다.
		Collections.sort(list, new ClassTotalComparator119());
		
		int prevBan = -1;
		int prevRank = -1;
		int prevTotal = -1;
		int length = list.size();
		
		for(int i=0, n=0; i<length; i++, n++){
			Student119 s = (Student119)list.get(i);
			
			if(s.ban != prevBan){
				prevRank = -1;
				prevTotal = -1;
				n = 0;
			}
			if(s.total == prevTotal){
				s.classRank = prevRank;
			}else{
				s.classRank = n+1;
			}
			
			prevBan = s.ban;
			prevRank = s.classRank;
			prevTotal = s.total;
		}
	}
	public static void calculateSchoolRank(List list){
		/* 내용 생략 */
		Collections.sort(list);
		
		int prevRank = -1;
		int prevTotal = -1;
		int length = list.size();
		
		for(int i=0; i<length; i++){
			Student119 s = (Student119)list.get(i);
			
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
		list.add(new Student119("이자바",2,1,70,90,70));
		list.add(new Student119("안자바",2,2,60,100,80));
		list.add(new Student119("홍길동",1,3,100,100,100));
		list.add(new Student119("남궁성",1,1,90,70,80));
		list.add(new Student119("김자바",1,2,80,80,90));
		
		calculateSchoolRank(list);
		calculateClassRank(list);
		
		Iterator it = list.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());

	}
}
