package exercise;

import java.util.*;

class RP116_Student implements Comparable{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	RP116_Student(String name, int ban, int no, int kor, int eng, int math){
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
				+","+getAverage();
	}
	
	public int compareTo(Object o){
		if(o instanceof RP116_Student){
			RP116_Student tmp = (RP116_Student)o;
			
			return name.compareTo(tmp.name);
		}else{
			return -1;
		}
	}
}

class RP_Exercise11_6 {
	static int getGroupCount(TreeSet tset, int from, int to){
		RP116_Student s1 = new RP116_Student("",0,0,from,from,from);
		RP116_Student s2 = new RP116_Student("",0,0,to,to,to);
		
		return tset.subSet(s1, s2).size();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet set = new TreeSet(new Comparator(){
			public int compare(Object o1, Object o2){
				if(o1 instanceof RP116_Student && o2 instanceof RP116_Student){
					RP116_Student s1 = (RP116_Student)o1;
					RP116_Student s2 = (RP116_Student)o2;
					
					return (int)(s1.getAverage()-s2.getAverage());
				}
				return -1;
			}
		});
		
		set.add(new RP116_Student("ȫ�浿",1,1,100,100,100));
		set.add(new RP116_Student("���ü�",1,2,90,70,80));
		set.add(new RP116_Student("���ڹ�",1,3,80,80,90));
		set.add(new RP116_Student("���ڹ�",1,4,70,90,70));
		set.add(new RP116_Student("���ڹ�",1,5,60,100,80));
		
		Iterator it = set.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
		
		System.out.println("[60~69] : " + getGroupCount(set,60,70));
		System.out.println("[70~79] : " + getGroupCount(set,70,80));
		System.out.println("[80~89] : " + getGroupCount(set,80,90));
		System.out.println("[90~100] : " + getGroupCount(set,90,101));
	}

}
