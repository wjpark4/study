package exercise;

class Ch6_BlockTest {
	
	static {
		System.out.println("static { }");
	}
	
	{
		System.out.println("{ }");
	}
	
	public Ch6_BlockTest() {
		System.out.println("»ý¼ºÀÚ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("BlockTest bt = new BlockTest() ; ");
		Ch6_BlockTest bt = new Ch6_BlockTest();
		
		System.out.println("BlockTestbt2 = new BlockTest();");
		Ch6_BlockTest bt2 = new Ch6_BlockTest();

	}

}
