package exercise;

class ch6_repeat {
	public static void main(String[] args) {
		RPStudent s = new RPStudent();
		s.name = "ȫ�浿";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("�̸� : " + s.name);
		System.out.println("���� : " + s.getTotal());
		System.out.println("��� : " + s.getAverage());
	}
}

class RPStudent{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	int getTotal(){
		int result = kor + eng + math;
		return result;
	}
	
	float getAverage(){
		return ((int)(getTotal() / 3f *10 + 0.5) / 10f);
	}
}
