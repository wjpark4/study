package exercise;

class ExceptionEx20 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			method1();
		} catch(Exception e){
			System.out.println("main메서드에서 예외가 처리되었다.");
			e.printStackTrace();
		}
	}
	
	static void method1() throws Exception{
		throw new Exception();
	}
}
