package exercise;

class Ch6_Document {
	static int count = 0;
	String name;
	
	public Ch6_Document(){
		this("제목없음" + ++count);
	}
	
	public Ch6_Document(String name){
		this.name = name;
		System.out.println("문서 " + this.name + "가 생성되었습니다.");
	}
}

class Ch6_DocumentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ch6_Document d1 = new Ch6_Document();
		Ch6_Document d2 = new Ch6_Document("자바.txt");
		Ch6_Document d3 = new Ch6_Document();
		Ch6_Document d4 = new Ch6_Document();

	}

}
