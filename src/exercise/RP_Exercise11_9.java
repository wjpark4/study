package exercise;

import java.util.*;

class RP119_Student implements Comparable{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	int total;
	int schoolRank;
	int classRank;
	
	RP119_Student(String name, int ban, int no, int kor, int eng, int math){
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
		if(o instanceof RP119_Student){
			RP119_Student s = (RP119_Student)o;
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
				+","+classRank
				;
	}
}

class RP119_ClassTotalComparator implements Comparator{
	
	public int compare(Object o1, Object o2){
		if(o1 instanceof RP119_Student &&  o2 instanceof RP119_Student){
			RP119_Student s1 = (RP119_Student)o1;
			RP119_Student s2 = (RP119_Student)o2;
			
			int result = s1.ban - s2.ban;
			
			if(result == 0)
				result = s2.total - s1.total;
			return result;
		}
		return -1;
	}
	
	/*
	public int compare(Object o1, Object o2){
		//(o1 instanceof RP119_Student &&  o2 instanceof RP119_Student){
			RP119_Student s1 = (RP119_Student)o1;
			RP119_Student s2 = (RP119_Student)o2;
			
			int result = s1.ban - s2.ban;
			
			if(result == 0)
				result = s2.total - s1.total;
			return result;
		//}
		//return -1;
	}
	*/
}

class RP_Exercise11_9 {
	public static void calculateClassRank(List list){
		Collections.sort(list, new RP119_ClassTotalComparator());
		
		int prevBan = -1;
		int prevRank = -1;
		int prevTotal = -1;
		int length = list.size();
		
		for(int i=0, n=0; i<length; i++, n++){
			RP119_Student s = (RP119_Student)list.get(i);
			
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
		Collections.sort(list);
		
		int prevRank = -1;
		int prevTotal = -1;
		int length = list.size();
		
		for(int i=0; i<length; i++){
			RP119_Student s = (RP119_Student)list.get(i);
			
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
		list.add(new RP119_Student("ÀÌÀÚ¹Ù",2,1,70,90,70));
		list.add(new RP119_Student("¾ÈÀÚ¹Ù",2,2,60,100,80));
		list.add(new RP119_Student("È«±æµ¿",1,3,100,100,100));
		list.add(new RP119_Student("³²±Ã¼º",1,1,90,70,80));
		list.add(new RP119_Student("±èÀÚ¹Ù",1,2,80,80,90));
		
		calculateSchoolRank(list);
		calculateClassRank(list);
		
		Iterator it = list.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
	}
}
