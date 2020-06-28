package exercise;

class Exercise6_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex6_5_Student s = new Ex6_5_Student("ȫ�浿", 1, 1, 100, 60, 76);
		
		System.out.println(s.info());

	}
}

class Ex6_5_Student{	
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	
	Ex6_5_Student(){
		
	}
	
	Ex6_5_Student(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal(){
		int result = kor + eng + math;
		return result;
	}
	
	float getAverage(){
		return ((int)(getTotal() / 3f *10 + 0.5) / 10f);
	}
	
	String info(){
		return name +", " +ban + ", " + no + ", " + kor + ", " + eng + ", " + math + ", " + getTotal() + ", " + getAverage() ;
	}
}
